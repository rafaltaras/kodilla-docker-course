package com.kodilla.products.api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "ORDERS")
@Getter
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue
    private long id;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;
    private String phone;

    private String address;

    public Order(Status status, Product product, String phone, String address) {
        this.status = status;
        this.product = product;
        this.phone = phone;
        this.address = address;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
