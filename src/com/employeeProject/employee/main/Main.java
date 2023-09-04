package com.employeeProject.employee.main;

import java.util.Scanner;

import com.employeeProject.employee.model.Employee;
import com.employeeProject.employee.service.CredentialService;
import com.employeeProject.employee.service.iCredentialService;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		iCredentialService service = new CredentialService();
			
		System.out.println("Enter your first Name");
		String firstName=sc.nextLine();
		
		System.out.println("Enter your last Name");
		String lastname=sc.nextLine();
		
		Employee employee = new Employee(firstName, lastname);
		
		System.out.println("Enter you department from the list given below:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int dept = sc.nextInt();
		switch(dept) {
		case 1: employee.setDepartment("tech");
				break;
		case 2: employee.setDepartment("admin");
				break;
		case 3: employee.setDepartment("hr");
				break;
		case 4: employee.setDepartment("legal");
				break;
		default: System.out.println("Please select a valid option!");	
				break;
		}
		
		if(employee.getFirstName()!=null && employee.getLastName() != null && employee.getDepartment()!= null) {
			service.generateEmail(employee);
			service.generatePassword(employee);
			service.showCredentials(employee);
			
		}else {
			System.out.println("Invalid Employee Details");
		}
			
		sc.close();
	}
	
}


