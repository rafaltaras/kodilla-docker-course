package com.kodilla.products.api.dto;

import com.kodilla.products.api.domain.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class OrderDto {

    private long id;
    private Status status;
    private long productId;
    private String phone;
    private String address;
}
