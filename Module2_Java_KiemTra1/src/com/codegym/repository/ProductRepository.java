package com.codegym.repository;

import com.codegym.model.Product;

import java.util.List;

public interface ProductRepository extends GeneralRepository<Product> {
    List<Product> sortPrice();
}
