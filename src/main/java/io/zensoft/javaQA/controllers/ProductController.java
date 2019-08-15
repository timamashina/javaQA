package io.zensoft.javaQA.controllers;

import io.zensoft.javaQA.models.Product;
import io.zensoft.javaQA.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("v1/api/product")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService defaultProductService) {
        this.productService = defaultProductService;
    }


    @GetMapping("/get-all")
    public List<Product> getAll() {
        return productService.getAll();
    }

    @PostMapping("/create")
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }

}
