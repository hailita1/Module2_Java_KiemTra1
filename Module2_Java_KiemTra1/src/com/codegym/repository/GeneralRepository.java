package com.codegym.repository;

import com.codegym.model.Product;

import java.util.List;

public interface GeneralRepository<E> {
    List<E> findAll();

    void addProduct(E e);

    void updateProduct(int id, E e);

    void deleteProduct(int id);

    Product findByName(String name);

    boolean checkProduct(Object o);
}
