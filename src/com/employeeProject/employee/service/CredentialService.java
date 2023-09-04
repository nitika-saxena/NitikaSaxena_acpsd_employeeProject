package com.employeeProject.employee.service;

import java.util.Random;

import com.employeeProject.employee.model.Employee;

public class CredentialService implements iCredentialService {

	private String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String lower="abcdefghijklmnopqrstuvwxyz";
	private String num="1234567890";
	private String splchar="!@#$%^&*()_+-=";
	private String pass = upper+lower+num+splchar;
	private Random random = new Random();
	
	@Override
	public void generateEmail(Employee employee) {
		String email = (employee.getFirstName()+employee.getLastName()
						+"@"+employee.getDepartment()+".gl.in").toLowerCase();
		employee.setEmail(email);
		
	}

	@Override
	public void generatePassword(Employee employee) {
		String password = "";
		for(int i =0;i<8;i++)
			password=password+pass.charAt(random.nextInt(pass.length()));
		employee.setPassword(password);
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear "+employee.getFirstName()+" yout generated Credentials are as follows:");
		System.out.println("Email: "+employee.getEmail());
		System.out.println("Password: "+employee.getPassword());
		
	}
	
}
