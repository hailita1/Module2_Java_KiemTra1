package com.codegym.service.Impl;

import com.codegym.model.Product;
import com.codegym.repository.Impl.ProductRepositotyImpl;
import com.codegym.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductRepositotyImpl productRepositoty = new ProductRepositotyImpl();

    @Override
    public List<Product> findAll() {
        return productRepositoty.findAll();
    }

    @Override
    public void add(Product product) {
        productRepositoty.add(product);
    }

    @Override
    public void update(int id, Product product) {
        productRepositoty.update(id, product);
    }

    @Override
    public void delete(int id) {
        productRepositoty.delete(id);
    }

    @Override
    public Product findByName(String name) {

        return productRepositoty.findByName(name);
    }

    @Override
    public boolean check(Object o) {
        return productRepositoty.check(o);
    }

    @Override
    public List sortPrice() {
        return productRepositoty.sortPrice();
    }
}
