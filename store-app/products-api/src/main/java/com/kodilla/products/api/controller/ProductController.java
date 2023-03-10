package com.kodilla.products.api.controller;

import com.kodilla.products.api.dto.ProductDto;
import com.kodilla.products.api.service.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductsService service;

    @GetMapping
    public List<ProductDto> getAll() {
        return service.getProducts();
    }

    @PostMapping
    public ProductDto create(@RequestBody ProductDto product) {
        return service.createProduct(product);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") long productId) {
        service.deleteProduct(productId);
    }
}
