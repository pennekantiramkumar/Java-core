package com.learning.core.day3session3;

import java.util.Hashtable;

public class D03P089 {
    public static void main(String[] args) {
        // Create a Hashtable to store Employee objects with employee id as key
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        // Add predefined information of 4 employees
        Employee emp1 = new Employee(1, "Mohan", "Web Development    ", "Web Developer");
        Employee emp2 = new Employee(2, "Ali  ", "Network Operation  ", "Manager ");
        Employee emp3 = new Employee(3, "Rohit", "Cybersecurity      ", "Cybersecurity Analyst");
        Employee emp4 = new Employee(4, "Raj  ", "Cloud Computing    ", "Systems Architect");


        employeeTable.put(emp1.getId(), emp1);
        employeeTable.put(emp2.getId(), emp2);
        employeeTable.put(emp3.getId(), emp3);
        employeeTable.put(emp4.getId(), emp4);

        // Verify whether the Hashtable is empty or not
        boolean isEmpty = employeeTable.isEmpty();
        System.out.println(isEmpty);
    }
}

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    // Constructor
    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Department: " + department + ", Designation: " + designation;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
