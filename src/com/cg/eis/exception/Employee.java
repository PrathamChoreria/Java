package com.cg.eis.exception;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void validateSalary() throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException("Salary is below 3000. Not valid");
        } else {
            System.out.println("Salary is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            Employee emp = new Employee("Vettel", 1230);
          
            emp.validateSalary();
            
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred");
        }
    }
}