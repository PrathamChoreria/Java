package com.deloitte.lab09.caseStudy;

//import java.time.LocalDate;
//import java.time.Period;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.function.Function;
//import java.util.stream.Collectors;

public class caseStudy{
	public static void main(String[] args) {
        EmployeeRepo repository = new EmployeeRepo();
        EmployeeService service = new EmployeeService(repository);

        // Example usage
        System.out.println("Total Salary: " + service.getTotalSalary());
        System.out.println("Department Employee Count: " + service.getDepartmentEmployeeCount());
        System.out.println("Senior Most Employee: " + service.getSeniorMostEmployee().getFirstName());
        System.out.println("Employee Service Duration: " + service.getEmployeeServiceDuration());
        System.out.println("Employees Without Department: " + service.getEmployeesWithoutDepartment());
        
    }
}
