package com.cg.eis.pl;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;


public class Output {
    public static void main(String[] args) {
        EmployeeService empService = new EmployeeServiceImpl();
       
        Employee emp = empService.getEmployeeDetails();

        empService.findInsuranceScheme(emp);

        empService.displayEmployeeDetails(emp);
    }
}


