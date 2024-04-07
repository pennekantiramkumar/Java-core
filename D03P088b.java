package com.learning.core.day3session3;

import java.util.Scanner;
import java.util.TreeMap;

public class D03P088b {
    public static void main(String[] args) {
        // Create a TreeMap to store Car objects
        TreeMap<Car4, Double> carMap = new TreeMap<>();

        // Add predefined information of 4 cars
        Car4 bugatti = new Car4("Bugatti", 80050.0);
        Car4 swift = new Car4("Swift", 305000.0);
        Car4 audi = new Car4("Audi", 600100.0);
        Car4 benz = new Car4("Benz", 900000.0);

        carMap.put(bugatti, bugatti.getPrice());
        carMap.put(swift, swift.getPrice());
        carMap.put(audi, audi.getPrice());
        carMap.put(benz, benz.getPrice());

        // Print the TreeMap before replacement
        System.out.println("TreeMap before replacement:");
        for (Car4 car : carMap.keySet()) {
            System.out.println(car.getName() + " " + car.getPrice());
        }

        // Get user input for the new car price
        Scanner sc = new Scanner(System.in);
        System.out.print("enter car price  :");
        double newPrice = sc.nextDouble();

        // Find the car with the specified price
        Car4 replacedCar = null;
        for (Car4 car : carMap.keySet()) {
            if (car.getPrice() == newPrice) {
                replacedCar = car;
                break;
            }
        }

        // Replace the name of the car with 'Reva' if found
        if (replacedCar != null) {
            replacedCar.setName("Reva");
            System.out.println("\nOutput:");
            System.out.println(replacedCar.getName() +"  "   + replacedCar.getPrice());
        } else {
            System.out.println("No car found with the specified price.");
        }

        // Close scanner
        sc.close();
    }
}

class Car4 implements Comparable<Car4> {
    private String name;
    private double price;

    // Constructor
    public Car4(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    // Implement compareTo method for natural ordering based on price
    @Override
    public int compareTo(Car4 other) {
        return Double.compare(this.price, other.price);
    }

    // Implement toString method
    @Override
    public String toString() {
        return name + " " + price;
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
        Car4 other = (Car4) obj;
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
