package com.kodilla.products.api.service;

import com.kodilla.products.api.domain.Product;
import com.kodilla.products.api.dto.ProductDto;
import com.kodilla.products.api.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductsService {

    private final ProductRepository productRepository;

    public List<ProductDto> getProducts() {
        return productRepository.findAll().stream().map(ProductsService::map).collect(Collectors.toList());
    }

    @Transactional
    public ProductDto createProduct(ProductDto product) {
        return map(productRepository.save(map(product)));
    }

    @Transactional
    public void deleteProduct(long productId) {
        productRepository.deleteById(productId);
    }

    private static ProductDto map(Product product) {
        return new ProductDto(product.getId(), product.getName(), product.getImage(), product.getPrice(), product.getDescription());
    }

    private static Product map(ProductDto product) {
        return new Product(product.getName(), product.getImage(), product.getPrice(), product.getDescription());
    }
}
