package com.employeeProject.employee.service;

import com.employeeProject.employee.model.Employee;

public interface iCredentialService {

	public void generateEmail(Employee employee);
	public void generatePassword(Employee employee);
	public void showCredentials(Employee employee);
}
