package com.nissan.app;

import java.util.List;
import java.util.Scanner;

import static com.nissan.util.BankCustomerUtil.*;

import com.nissan.pojo.BankCustomer;

public class BankCustomerApp {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			List<BankCustomer> bankCustomerList = loadBankCustomerDetails();
			boolean loop = true;
			System.out.println("------------------Welcome to HDFC Bank----------------------");
			String accNumber;
			
			while(loop) {
				System.out.println("Press 0 to exit");
				System.out.println("Press 1 to deposit amount");
				System.out.println("Press 2 to withdraw amount");
				System.out.println("Press 3 to see balance");
				System.out.println("Press 4 to transfer amount");
				System.out.print("Enter your choice: ");
				int choice = scan.nextInt();
				
				switch (choice) {
				case 0:
					loop = false;
					System.out.println("Thank you for visiting!");
					System.exit(0);
					break;
				case 1:
					System.out.println("Enter account number: ");
					scan.nextLine();
					accNumber = scan.nextLine();
					depositMoney(accNumber, bankCustomerList);
					break;
					
				case 2:
					System.out.println("Enter account number: ");
					scan.nextLine();
					accNumber = scan.nextLine();
					withdrawMoney(accNumber, bankCustomerList);
					break;
					
				case 3:
					System.out.println("Enter account number: ");
					scan.nextLine();
					accNumber = scan.nextLine();
					showBalance(accNumber, bankCustomerList);
					break;

				case 4:
//					System.out.println("In progress!!!");
					System.out.println("Enter depositor's account number: ");
					scan.nextLine();
					String senderAccNumber = scan.nextLine();
					System.out.println("Enter beneficiary's account number: ");
					String beneficiaryAccNumber = scan.nextLine();
					System.out.println(transferAmount(senderAccNumber, beneficiaryAccNumber, bankCustomerList));
					break;
					
				
					
				default:
					System.out.println("Invalid choice");
					break;
				}
			}
			scan.nextLine();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
