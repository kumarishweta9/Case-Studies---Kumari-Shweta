package com.employee.mgmt.service;

import java.util.List;

import com.employee.mgmt.model.Employee;

public interface EmployeeService {
	
	List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);

}
