package com.codegym.view;

import com.codegym.controller.ProductController;
import com.codegym.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            ProductTest.menu();
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    List<Product> productList = productController.getProducts();
                    for (Product p : productList) {
                        System.out.println("ID:\t " + p.getId() + "\t NAME: " + p.getName() + "\tPRICE: " + p.getPrice() + "\tSTATUS: " + p.getStatus() + "\tDESCRIPTION: " + p.getDescription());
                    }
                    break;
                }
                case 2: {
                    Product product = ProductTest.productFormAdd();
                    productController.addProduct(product);
                    break;
                }
                case 3: {
                    System.out.println("Nhap ID san pham ban muon thay doi: ");
                    int id = input.nextInt();
                    if (productController.check(id) == true) {
                        Product product = ProductTest.productFromUpdate();
                        productController.updateProduct(id, product);
                    } else {
                        System.out.println("Khong co ID san pham can thay doi !!!");
                    }

                    break;
                }
                case 4: {
                    System.out.println("Nhap ID san pham ban muon xoa: ");
                    int id = input.nextInt();
                    if (productController.check(id) == true) {
                        productController.deleteProduct(id);
                    } else {
                        System.out.println("Khong co ID ban muon xoa !!!");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Nhap ten san pham muon tim: ");
                    String nameSp = new Scanner(System.in).nextLine();
                    if (productController.check((String) nameSp) == true) {
                        productController.findByName(nameSp);
                    } else {
                        System.out.println("Khong co san pham trong danh sach !!!");
                    }

                    break;
                }
                case 6: {
                    productController.sortPrice();
                    break;
                }

                case 0: {
                    System.exit(0);
                }
            }

        } while (choice != 0);
    }

    public static void menu() {
        System.out.println("-------------------------------------------");
        System.out.println("Quan ly san pham");
        System.out.println("1. Hien thi danh sach san pham");
        System.out.println("2. Them moi san pham");
        System.out.println("3. Sua thong tin san pham");
        System.out.println("4. Xoa san pham");
        System.out.println("5. Tim san pham theo ten");
        System.out.println("6. Sap xep san pham theo gia");
        System.out.println("0. Thoat");
        System.out.println("Nhap vao lua chon:");
    }

    public static Product productFormAdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap name: ");
        String name = scanner.nextLine();
        System.out.println("Nhap gia: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhap trang thai: ");
        String status = scanner.nextLine();
        System.out.println("Nhap dac diem: ");
        String description = scanner.nextLine();
        Product product = new Product(id, name, price, status, description);
        return product;
    }

    public static Product productFromUpdate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID moi: ");
        int newId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap NAME moi: ");
        String newName = scanner.nextLine();
        System.out.println("Nhap PRICE moi: ");
        double newPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhap STATUS moi: ");
        String newStatus = scanner.nextLine();
        System.out.println("Nhap DESCRIPTION moi: ");
        String newDescription = scanner.nextLine();
        Product newProduct = new Product(newId, newName, newPrice, newStatus, newDescription);
        return newProduct;
    }
}

