package com.kodilla.quotes.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "quotes")
public final class Quote {
    @Id
    private Long id;
    private String author;
    private String content;
}
