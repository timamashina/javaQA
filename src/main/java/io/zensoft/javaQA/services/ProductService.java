package io.zensoft.javaQA.services;

import io.zensoft.javaQA.models.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();

    Product get(Long id);

    Product create(Product product);

    Product update(Product product);

    Product delete(Long id);


}
