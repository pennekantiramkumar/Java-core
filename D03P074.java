package com.learning.core.day3session3;
import java.util.HashSet;
import java.util.*;

class Product2 {
    private String productId;
    private String productName;

    public Product2(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product2 product = (Product2) obj;
        return productId.equals(product.productId);
    }
}

public class D03P074 {
    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();

        // Predefined information of 4 products
        Product product1 = new Product("P001", "Maruti 800");
        Product product2 = new Product("P002", "Maruti Zen");
        Product product3 = new Product("P003", "Maruti Dezire");
        Product product4 = new Product("P004", "Maruti Alto");

        // Adding products to the HashSet
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        // Input the product ID to remove
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product ID to remove:");
        String removeProductId = sc.next();

        // Removing the product from the HashSet
        boolean removed = false;
        for (Product product : products) {
            if (product.getProductId().equals(removeProductId)) {
                products.remove(product);
                removed = true;
                break;
            }
        }

        // Displaying the updated product list
        if (removed) {
            System.out.println("Product with ID " + removeProductId + " removed successfully.");
            System.out.println("Updated Product List:");
            for (Product product : products) {
                System.out.println(product);
            }
        } else {
            System.out.println("Product with ID " + removeProductId + " not found.");
        }

        sc.close();
    }
}
