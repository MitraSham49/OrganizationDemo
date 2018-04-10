package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class OrganizApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Organization anOrganization;
        Employee anEmployee;
        String addEmployee = "";
        String addOrganization = "";
        boolean orgDone = false;
        boolean empDone = false;
        ArrayList<Organization> allOrganization = new ArrayList<>();


        do {
            System.out.print("Enter name of organization: ");
            anOrganization = new Organization(keyboard.nextLine());
            System.out.println("Your Organization  is called:" + anOrganization.getName());
            do {
                anEmployee = new Employee();
                System.out.println("Enter employee name:    ");
                anEmployee.setEmpFirstName(keyboard.nextLine());
                System.out.println("Enter employee Last name :    ");
                anEmployee.setEmpLastName(keyboard.nextLine());
                System.out.println("Enter employee Id Number:    ");
                anEmployee.setEmpNumber(keyboard.nextLine());

                System.out.println("Your employee information is: Employee Name: " + anEmployee.getEmpFirstName()+
                        "  Employee Last Name: " + anEmployee.getEmpLastName()+"  Employee ID Number:" +anEmployee.getEmpNumber());

                anOrganization.addEmployee(anEmployee);
                System.out.println("Do you want to enter details for another employee?");
                addEmployee = keyboard.nextLine();
                if (addEmployee.equalsIgnoreCase("no") || addEmployee.equalsIgnoreCase("n"))
                    empDone = true;

            } while (!empDone);
            //Add organization  to the organization list
            empDone =false;
            allOrganization.add(anOrganization);
            System.out.println("Do you want to enter another organization?");
            addOrganization = keyboard.nextLine();
            if (addOrganization.equalsIgnoreCase("no") || addOrganization.equalsIgnoreCase("n"))
                orgDone = true;
        } while (!orgDone);

        for (Organization eachOrganization : allOrganization) {
            System.out.println("These are Employee for " + eachOrganization.getName());
            for(Employee  eachEmployee:eachOrganization.getTheEmployees() ){
                System.out.println("These are the details of the Employee:"+" Name: "+ eachEmployee.getEmpFirstName()+
                                "  "+eachEmployee.getEmpLastName()+", EmployeeID:  "+eachEmployee.getEmpNumber());



            }
            }
        }

    }

