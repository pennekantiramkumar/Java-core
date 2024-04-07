package com.learning.core.day3session3;


import java.util.TreeMap;

public class D03P085 {
    public static void main(String[] args) {
        // Create a TreeMap to store Car objects
        TreeMap<Car, Double> carMap = new TreeMap<>();

        // Add predefined information of 4 cars
        carMap.put(new Car("Bugatti", 80050.0), 80050.0);
        carMap.put(new Car("Swift  ", 305000.0), 305000.0);
        carMap.put(new Car("Audi   ", 600100.0), 600100.0);
        carMap.put(new Car("Benz   ", 900000.0), 900000.0);

        // Print all the car details
        System.out.println("Car Details:");
        for (Car car : carMap.keySet()) {
            System.out.println(car.getName() + " " + car.getPrice());
        }
    }
}

class Car implements Comparable<Car> {
    private String name;
    private double price;

    // Constructor
    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Implement compareTo method for natural ordering based on price
    @Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }

    // Implement toString method
    @Override
    public String toString() {
        return name;
    }
}
