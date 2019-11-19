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
    public void addProduct(Product product) {
        listProducts.add(product);
    }

    @Override
    public void updateProduct(int id, Product product) {
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
    public void deleteProduct(int id) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                listProducts.remove(i);
                return;
            }
        }
    }

    @Override
    public Product findByName(String name) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getName().contains(name)) {
                return listProducts.get(i);
            }

        }
        return null;
    }

    @Override
    public boolean checkProduct(Object o) {
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
    public List<Product> sortPrice() {
        Collections.sort(listProducts, new ProductComparator());
        return listProducts;

    }

}

