package com.example.demo;

public class Employee {

    private  String empNumber;
    private String empFirstName;
    private String empLastName;

    public Employee() {

    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }


    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empNumber='" + empNumber + '\'' +
                ", empFirstName='" + empFirstName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                '}';
    }
}
