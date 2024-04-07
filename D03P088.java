package com.learning.core.day3session3;

import java.util.TreeMap;

public class D03P088 {
    public static void main(String[] args) {
        // Create a TreeMap to store Car objects
        TreeMap<Car3, Double> carMap = new TreeMap<>();

        // Add predefined information of 4 cars
        Car3 bugatti = new Car3("Bugatti", 80050.0);
        Car3 swift = new Car3("Swift", 305000.0);
        Car3 audi = new Car3("Audi", 600100.0);
        Car3 benz = new Car3("Benz", 900000.0);

        carMap.put(bugatti, bugatti.getPrice());
        carMap.put(swift, swift.getPrice());
        carMap.put(audi, audi.getPrice());
        carMap.put(benz, benz.getPrice());

        // Print the TreeMap before removal
        System.out.println("TreeMap before removal:");
        for (Car3 car : carMap.keySet()) {
            System.out.println(car.getName() + " " + carMap.get(car));
        }

        // Remove the car with the greatest key
        Car3 greatestKey = carMap.lastKey();
        carMap.remove(greatestKey);

        // Get the key-value mapping associated with the greatest key
        System.out.println("\nKey-value mapping associated with the greatest key:");
        System.out.println(greatestKey.getName() + " " + carMap.get(greatestKey));

        // Print the TreeMap after removal
        System.out.println("\nTreeMap after removal:");
        for (Car3 car : carMap.keySet()) {
            System.out.println(car.getName() + " " + carMap.get(car));
        }
    }
}

class Car3 implements Comparable<Car3> {
    private String name;
    private double price;

    // Constructor
    public Car3(String name, double price) {
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
    public int compareTo(Car3 other) {
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
        Car3 other = (Car3) obj;
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
