package com.learning.core.day3session3;

import java.util.Hashtable;
import java.util.Scanner;

public class D03P0810 {
	
	    public static void main(String[] args) {
	        // Create a Hashtable to store Employee objects with employee id as key
	        Hashtable<Integer, Employeee> employeeTable = new Hashtable<>();

	        // Add predefined information of 4 employees
	        Employeee emp1 = new Employeee(1, "Mohan", "Web Development    ", "Web Developer");
	        Employeee emp2 = new Employeee(2, "Ali  ", "Network Operation  ", "Manager ");
	        Employeee emp3 = new Employeee(3, "Rohit", "Cybersecurity      ", "Cybersecurity Analyst");
	        Employeee emp4 = new Employeee(4, "Raj  ", "Cloud Computing    ", "Systems Architect");

	        employeeTable.put(emp1.getId(), emp1);
	        employeeTable.put(emp2.getId(), emp2);
	        employeeTable.put(emp3.getId(), emp3);
	        employeeTable.put(emp4.getId(), emp4);

	        // Get user input for the employee ID
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the employee ID: ");
	        int searchId = sc.nextInt();

	        // Search for the employee by the entered ID
	        Employeee searchedEmployee = employeeTable.get(searchId);
	        if (searchedEmployee != null) {
	            System.out.println(searchedEmployee);
	        } else {
	            System.out.println("Employee with ID " + searchId + " not found.");
	        }

	        // Close scanner
	        sc.close();
	    }
	}

	class Employeee {
	    private int id;
	    private String name;
	    private String department;
	    private String designation;

	    // Constructor
	    public Employeee(int id, String name, String department, String designation) {
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
	        return id + " " + name + " " + designation + " " + department;
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
	        Employeee other = (Employeee) obj;
	        if (id != other.id)
	            return false;
	        return true;
	    }
	}

