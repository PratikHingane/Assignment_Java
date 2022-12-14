package com.faith.app;

import java.util.Scanner;

import com.nissan.lib.FixedDeposit;
import com.nissan.lib.SavingAccount;

public class TestInterestApp {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the type of account"+
				"\n Press F for fixed deposit type and S for savings acc.");
		char choice=input.next().charAt(0);
		if(choice=='F')
		{
			try{
				FixedDeposit customer=new FixedDeposit();
				System.out.println("Enter principle number:");
				customer.setPrinciple(input.nextDouble());
				System.out.println("Enter time in years:");
				customer.setTimeinYear(input.nextInt());
				System.out.println("Interest Rate is "+customer.getInterestRate());
				System.out.println("Your interest is :"+
				calculateInterest(customer.getPrinciple(),customer.getTimeinYear(),
						customer.getRate()));
			}
			catch(Exception e)
			{
				System.out.println("Exception occured");
			}
			
		}
		else if(choice=='S')
		{
			try{
				SavingAccount customer=new SavingAccount();
				System.out.println("Enter principle number:");
				customer.setPrinciple(input.nextDouble());
				System.out.println("Enter time in years:");
				customer.setTimeinYear(input.nextInt());
				System.out.println("Interest Rate is "+customer.getInterestRate());
				System.out.println("Your interest is :"+
				calculateInterest(customer.getPrinciple(),customer.getTimeinYear(),
						customer.getRate()));
			}
			catch(Exception e)
			{
				System.out.println("Exception occured");
			}

		}
		else
		{
			System.out.println("Wrong choice please select correct account type");
		}
		
		
		
	}
	public static double calculateInterest(double principle,int time,double rate)
	{
		return (principle*time*rate);
	}
	
}
