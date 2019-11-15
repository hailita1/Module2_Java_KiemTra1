package com.codegym.repository;

import java.util.List;

public interface GeneralRepository<E> {
    List<E> findAll();

    void add(E e);

    void update(int id, E e);

    void delete(int id);

    void findByName(String name);

    boolean check(Object o);
}
