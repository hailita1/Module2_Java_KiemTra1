package com.codegym.repository;

import com.codegym.model.Product;

import java.util.List;

public interface GeneralRepository<E> {
    List<E> findAll();

    void add(E e);

    void update(int id, E e);

    void delete(int id);

    Product findByName(String name);

    boolean check(Object o);
}
