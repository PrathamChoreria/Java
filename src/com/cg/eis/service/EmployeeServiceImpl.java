package com.cg.eis.service;


import com.cg.eis.bean.Employee;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Employee getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Enter Employee Designation: ");
        String designation = sc.nextLine();

        String insuranceScheme = ""; 
        sc.close();
        return new Employee(id, name, salary, designation, insuranceScheme);
        
        
    }

    @Override
    public void findInsuranceScheme(Employee emp) {
        String scheme = "No Scheme";

        if (emp.getSalary() > 50000) {
            scheme = "Premium Scheme";
        } else if (emp.getSalary() > 30000) {
            scheme = "Standard Scheme";
        } else if (emp.getSalary() > 15000) {
            scheme = "Basic Scheme";
        }

        emp.setInsuranceScheme(scheme);
    }

    @Override
    public void displayEmployeeDetails(Employee emp) {
        System.out.println(emp);
    }
}