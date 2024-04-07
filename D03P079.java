package com.learning.core.day3session3;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Objects;

class Person4 implements Comparable<Person4> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person4(int id, String name, int age, double salary) {
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
        Person4 person = (Person4) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Person4 other) {
        return Integer.compare(this.id, other.id);
    }
}


public class D03P079 {
    public static void main(String[] args) {
        TreeSet<Person4> persons = new TreeSet<>();

        Scanner sc = new Scanner(System.in);

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
            persons.add(new Person4(id, name, age, salary));
        }

        // Input the letter to search
        System.out.print("Enter the starting letter to search for a person's name: ");
        char startLetter = sc.next().charAt(0);

        // Finding the first person whose name starts with the input letter
        boolean found = false;
        for (Person4 person : persons) {
            if (person.getName().toLowerCase().charAt(0) == Character.toLowerCase(startLetter)) {
                System.out.println("First person whose name starts with '" + startLetter + "':");
                System.out.println(person);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No person found whose name starts with '" + startLetter + "'");
        }

        sc.close();
    }
}

