package io.zensoft.javaQA.services.impl;

import io.zensoft.javaQA.models.Product;
import io.zensoft.javaQA.repository.ProductRepository;
import io.zensoft.javaQA.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultProductService implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public DefaultProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product get(Long id) {
        return null;
    }

    @Override
    public Product create(Product product) {

        productRepository.save(product);

        return product;
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public Product delete(Long id) {
        return null;
    }
}
