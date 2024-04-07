package com.learning.core.day3session3;

import java.util.Objects;
import java.util.TreeSet;
import java.util.Scanner;
class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }
}


public class D03P075 {
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();

        Scanner scanner = new Scanner(System.in);

        // Predefined information of 6 persons
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            persons.add(new Person(id, name, age, salary));
        }

        // Printing all persons with age greater than 25
        System.out.println("Persons with age greater than 25:");
        for (Person person : persons) {
            if (person.getAge() > 25) {
                System.out.println(person);
            }
        }

        scanner.close();
    }
}
