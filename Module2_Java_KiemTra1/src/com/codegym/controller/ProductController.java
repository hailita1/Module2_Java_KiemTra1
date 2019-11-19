package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.Impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
    ProductServiceImpl productService = new ProductServiceImpl();

    public List<Product> getProducts() {
        return productService.findAll();
    }

    public void addProduct(Product product) {
        productService.add(product);
    }

    public void updateProduct(int id, Product product) {
        productService.update(id, product);
    }

    public void deleteProduct(int id) {
        productService.delete(id);
    }

    public Product findByName(String name) {
        return productService.findByName(name);
    }

    public boolean check(Object o) {
        return productService.check(o);
    }

    public List<Product> sortPrice() {
        return productService.sortPrice();
    }
}
