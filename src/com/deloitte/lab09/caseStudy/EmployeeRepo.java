package com.deloitte.lab09.caseStudy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo {
    private List<Employee> employees;
    private List<Department> departments;

    public void EmployeeRepository() {
        departments = new ArrayList<>();
        employees = new ArrayList<>();

        Department dept1 = new Department(1, "HR", 101);
        Department dept2 = new Department(2, "IT", 102);
        Department dept3 = new Department(3, "Finance", 103);

        departments.add(dept1);
        departments.add(dept2);
        departments.add(dept3);

        employees.add(new Employee(1, "John", "Doe", "john.doe@example.com", "1234567890", LocalDate.of(2020, 1, 15), "Manager", 75000.0, 101, dept1));
        employees.add(new Employee(2, "Jane", "Smith", "jane.smith@example.com", "0987654321", LocalDate.of(2019, 5, 22), "Developer", 65000.0, 102, dept2));
        employees.add(new Employee(3, "Emily", "Johnson", "emily.johnson@example.com", "1122334455", LocalDate.of(2021, 7, 30), "Analyst", 55000.0, null, dept3));
        employees.add(new Employee(4, "Michael", "Williams", "michael.williams@example.com", "5566778899", LocalDate.of(2022, 2, 10), "Assistant", 50000.0, 101, dept1));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Department> getDepartments() {
        return departments;
    }
}
