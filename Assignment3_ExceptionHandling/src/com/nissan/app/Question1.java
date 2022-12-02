package com.nissan.app;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
		
public class Question1 {

	/*
	 * a. Write a program that collects information of employees in an organization. 
	 * When the user gives the input make sure that employee’s age should be between 18 and 60. 
	 * If otherwise, throw exception.

	 */
	public static void main(String[] args) {
		acceptEmployee();

	}

	private static void acceptEmployee() {
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter Employee Name : ");
			String empName=scanner.next();
			System.out.println("Enter Employee age: ");
			int age=validateAge(scanner.nextInt());
			System.out.println("Employee Name: "+empName+"\nEmployee age: "+age);
			
			
		}catch(Exception e) {
			System.out.println("Invalid Input...");
		}
		
	}

	private static int validateAge(int inputAge) {
		try {
			
			Scanner scanner = new Scanner(System.in);
			
		do {
			
			if(inputAge<18) {
				System.out.println("Employee age should not be below 18 years.Please try again.");
				inputAge=scanner.nextInt();
			}else if(inputAge>60) {
				System.out.println("Employee age should not be above 60 years.Please try again.");
				inputAge=scanner.nextInt();
			}else {
				break;
			}
			
			return inputAge;
		}while(true);
		}catch(Exception e) {
			System.out.println("OOPS!! Enter valid details..");
		}
		return inputAge;
		
	}

}
