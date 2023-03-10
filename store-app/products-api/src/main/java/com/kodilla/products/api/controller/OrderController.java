package com.kodilla.products.api.controller;

import com.kodilla.products.api.domain.Status;
import com.kodilla.products.api.dto.OrderDto;
import com.kodilla.products.api.service.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrdersService service;

    @GetMapping
    public List<OrderDto> getAll() {
        return service.getOrders();
    }

    @PostMapping
    public OrderDto create(@RequestBody OrderDto order) {
        return service.createOrder(order);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") long orderId) {
        service.deleteOrder(orderId);
    }

    @PutMapping("{id}")
    public OrderDto update(@PathVariable("id") long orderId, @RequestParam("status") Status status) {
        return service.updateStatus(orderId, status);
    }

}
