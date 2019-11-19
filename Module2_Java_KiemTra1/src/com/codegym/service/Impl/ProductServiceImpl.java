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
    public void addProduct(Product product) {
        productRepositoty.addProduct(product);
    }

    @Override
    public void updateProduct(int id, Product product) {
        productRepositoty.updateProduct(id, product);
    }

    @Override
    public void deleteProduct(int id) {
        productRepositoty.deleteProduct(id);
    }

    @Override
    public Product findByName(String name) {

        return productRepositoty.findByName(name);
    }

    @Override
    public boolean checkProduct(Object o) {
        return productRepositoty.checkProduct(o);
    }

    @Override
    public List sortPrice() {
        return productRepositoty.sortPrice();
    }
}
