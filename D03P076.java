package com.learning.core.day3session3;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Objects;

class Person1 implements Comparable<Person1> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person1(int id, String name, int age, double salary) {
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
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person1 person = (Person1) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Person1 other) {
        return Integer.compare(this.id, other.id);
    }
}




public class D03P076 {
    public static void main(String[] args) {
        TreeSet<Person1> persons = new TreeSet<>();

        Scanner sc= new Scanner(System.in);

        // Predefined information of 6 persons
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            persons.add(new Person1(id, name, age, salary));
        }

        // Printing id, name, and salary of each person
        System.out.println("ID, Name, Salary of each person:");
        for (Person1 person : persons) {
            System.out.println(person.getId() + ", " + person.getName() + ", " + person.getSalary());
        }

        sc.close();
    }
}

