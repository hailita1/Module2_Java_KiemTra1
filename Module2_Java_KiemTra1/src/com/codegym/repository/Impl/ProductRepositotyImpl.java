package com.codegym.repository.Impl;

import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;

import java.util.*;

public class ProductRepositotyImpl implements ProductRepository {
    ArrayList<Product> listProducts = new ArrayList<>();

    {
        listProducts.add(new Product(1, "Dien Thoai SamSung", 10.0, "Tot", "hihi"));
        listProducts.add(new Product(2, "Iphone X", 50.0, "Rat Tot", "haha"));
        listProducts.add(new Product(3, "OPPO", 15.0, "Tot", "kiki"));
        listProducts.add(new Product(4, "Dien Thoai Sony", 8.0, "Dung tam", "kaka"));
        listProducts.add(new Product(5, "Iphone XII", 100.0, "Max Tot", "wow wow"));
    }

    @Override
    public List<Product> findAll() {
        return listProducts;
    }

    @Override
    public void add(Product product) {
        listProducts.add(product);
    }

    @Override
    public void update(int id, Product product) {
        int index = -1;
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        listProducts.set(index, product);

    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                listProducts.remove(i);
                return;
            }
        }
    }

    @Override
    public void findByName(String name) {
        ArrayList<Product> productLists = new ArrayList<>();
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getName().contains(name)) {
                productLists.add(listProducts.get(i));
            }
        }
        for (Product p : productLists) {
            System.out.println("ID: " + p.getId() + "\tNAME: " + p.getName() + "\tPRICE: " + p.getPrice() + "\tSTATUS: " + p.getStatus() + "\tDESCRIPTION: " + p.getDescription());
        }
    }

    @Override
    public boolean check(Object o) {
        boolean check = false;
        int id = -1;

        try {
            id = (int) o;
        } catch (Exception e) {

        }
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getName().equals(o) || listProducts.get(i).getId() == id) {
                check = true;
                break;
            }
        }
        return check;
    }


    @Override
    public void sortPrice() {
        Collections.sort(listProducts, new ProductComparator());
        for (Product p : listProducts) {
            System.out.println("ID: " + p.getId() + "\tNAME: " + p.getName() + "\tPRICE: " + p.getPrice() + "\tSTATUS: " + p.getStatus() + "\tDESCRIPTION: " + p.getDescription());
        }
    }

}

