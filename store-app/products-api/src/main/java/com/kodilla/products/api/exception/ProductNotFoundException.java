package com.kodilla.products.api.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(long id) {
        super("Product wit id= " + id + " not found");
    }
}
