package com.kodilla.products.api.notification;

import com.kodilla.products.api.dto.OrderDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationSender {

    private final AmqpTemplate rabbitTemplate;

    private final Environment env;

    public void sendPhoneNotificationIfNeeded(OrderDto order) {
        try {
            rabbitTemplate.convertAndSend("", env.getProperty("RABBITMQ_QUEUE_NAME"), prepareMessage(order));
        } catch (AmqpException ex) {
            log.error(ex.getMessage());
        }
    }

    private static String prepareMessage(OrderDto order) {
        return String.format("Sending SMS to phone number %s: Order with id=%d has new status %s.", order.getPhone(), order.getId(), order.getStatus());
    }
}
