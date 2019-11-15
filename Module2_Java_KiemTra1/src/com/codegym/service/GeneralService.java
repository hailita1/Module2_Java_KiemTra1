package com.codegym.service;

import java.util.List;

public interface GeneralService<E> {
    List<E> findAll();

    void add(E e);

    void update(int id, E e);

    void delete(int id);

    void findByName(String name);

    boolean check(Object o);
}
