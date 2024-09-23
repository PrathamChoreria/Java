package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	    Employee getEmployeeDetails();
	    void findInsuranceScheme(Employee emp);
	    void displayEmployeeDetails(Employee emp);
}
