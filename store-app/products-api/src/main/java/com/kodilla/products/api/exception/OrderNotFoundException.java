package com.kodilla.products.api.exception;

public class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException(long id) {
        super("Order wit id= " + id + " not found");
    }
}
