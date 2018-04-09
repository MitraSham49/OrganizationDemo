package com.example.demo;

import java.util.ArrayList;

public class Organization {
    private  String organizationName;
    private ArrayList<Employee> employees;

    public Organization() {
        employees = new ArrayList<>();
    }

     public  void addEmployee (Employee employee) {
         employees.add(employee);
     }

    public Organization(String organizationName) {
        this.organizationName = organizationName;
        employees= new ArrayList<>();
    }

    public String getOrganizationName() {
        return organizationName;
    }


    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
