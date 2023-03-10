package com.kodilla.products.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDto {

    private long id;
    private String name;
    private String image;
    private double price;
    private String description;
}
