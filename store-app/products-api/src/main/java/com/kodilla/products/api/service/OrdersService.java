
package com.kodilla.products.api.service;

import com.kodilla.products.api.domain.Order;
import com.kodilla.products.api.domain.Product;
import com.kodilla.products.api.domain.Status;
import com.kodilla.products.api.dto.OrderDto;
import com.kodilla.products.api.exception.OrderNotFoundException;
import com.kodilla.products.api.exception.ProductNotFoundException;
import com.kodilla.products.api.notification.NotificationSender;
import com.kodilla.products.api.repository.OrderRepository;
import com.kodilla.products.api.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrdersService {

    private final OrderRepository orderRepository;

    private final ProductRepository productRepository;

    private final NotificationSender notificationSender;

    public List<OrderDto> getOrders() {
        return orderRepository.findAll().stream().map(OrdersService::map).collect(Collectors.toList());
    }

    @Transactional
    public OrderDto createOrder(OrderDto order) {
        Product product = productRepository.findById(order.getProductId()).orElseThrow(() -> new ProductNotFoundException(order.getProductId()));
        Order savedOrder = orderRepository.save(map(order, product));
        return map(savedOrder);
    }

    @Transactional
    public OrderDto updateStatus(long orderId, Status status) {
        return orderRepository.findById(orderId).map(order -> {
            order.setStatus(status);
            notificationSender.sendPhoneNotificationIfNeeded(map(order));
            return order;
        })
        .map(OrdersService::map)
        .orElseThrow(() -> new OrderNotFoundException(orderId));
    }

    @Transactional
    public void deleteOrder(long orderId) {
        orderRepository.deleteById(orderId);
    }

    private static OrderDto map(Order order) {
        return new OrderDto(order.getId(), order.getStatus(), order.getProduct().getId(), order.getPhone(), order.getAddress());
    }

    private static Order map(OrderDto order, Product product) {
        return new Order(Status.NEW, product, order.getPhone(), order.getAddress());
    }
}
