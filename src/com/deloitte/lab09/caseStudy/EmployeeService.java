package com.deloitte.lab09.caseStudy;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {
    EmployeeRepo employeeRepository;

    public EmployeeService(EmployeeRepo employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    public double getTotalSalary() {
        List<Employee> employees = employeeRepository.getEmployees();
        return employees.stream()
                        .mapToDouble(Employee::getSalary)
                        .sum();
    }
    
    public Map<String, Long> getDepartmentEmployeeCount() {
        List<Employee> employees = employeeRepository.getEmployees();
        return employees.stream()
                        .filter(emp -> emp.getDepartment() != null)
                        .collect(Collectors.groupingBy(emp -> emp.getDepartment().getDepartmentName(), Collectors.counting()));
    }
    
    public Employee getSeniorMostEmployee() {
        List<Employee> employees = employeeRepository.getEmployees();
        return employees.stream()
                        .min((e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate()))
                        .orElse(null); 
    }
    public Map<Object, Object> getEmployeeServiceDuration() {
        List<Employee> employees = employeeRepository.getEmployees();
        return employees.stream()
                        .collect(Collectors.toMap(
                            emp -> emp.getFirstName() + " " + emp.getLastName(),
                            emp -> {
                                LocalDate hireDate = emp.getHireDate();
                                Period period = Period.between(hireDate, LocalDate.now());
                                return period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days";
                            }
                        ));
    }
    public List<Employee> getEmployeesWithoutDepartment() {
        List<Employee> employees = employeeRepository.getEmployees();
        return employees.stream()
                        .filter(emp -> emp.getDepartment() == null)
                        .collect(Collectors.toList());
    }

	
}