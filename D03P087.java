package com.learning.core.day3session3;

import java.util.TreeMap;


public class D03P087 {
    public static void main(String[] args) {
        // Create a TreeMap to store Car objects
        TreeMap<Car2, Double> carMap = new TreeMap<>();

        // Add predefined information of 4 cars
        Car2 bugatti = new Car2("Bugatti", 80050.0);
        Car2 swift = new Car2("Swift", 305000.0);
        Car2 audi = new Car2("Audi", 600100.0);
        Car2 benz = new Car2("Benz", 900000.0);

        carMap.put(bugatti, bugatti.getPrice());
        carMap.put(swift, swift.getPrice());
        carMap.put(audi, audi.getPrice());
        carMap.put(benz, benz.getPrice());

        // Retrieve the key-value mapping associated with the greatest price
        System.out.println("Car with the greatest price:");
        System.out.println(carMap.lastEntry().getKey().getName() + " " + carMap.lastEntry().getValue());

        // Retrieve the key-value mapping associated with the least price
        System.out.println("Car with the least price:");
        System.out.println(carMap.firstEntry().getKey().getName() + " " + carMap.firstEntry().getValue());
    }
}

class Car2 implements Comparable<Car2> {
    private String name;
    private double price;

    // Constructor
    public Car2(String name, double price) {
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
    public int compareTo(Car2 other) {
        return Double.compare(this.price, other.price);
    }

    // Implement toString method
    @Override
    public String toString() {
        return name;
    }

    // Implement hashCode method
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    // Implement equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car2 other = (Car2) obj;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}
