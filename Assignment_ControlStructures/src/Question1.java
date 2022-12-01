import java.util.Scanner;

/*
 * Consider an electricity billing calculation. There are two types of customers. 
 * Domestic and Industry. If it is domestic, the slabs are like this,
The reading in the range,0-100 then amt=units* Rs.1
100-200amt=units*1.5
200-500amt=units*2
>500amt = units*5
If it is industrial, the amt =units*10.
*/
public class Question1 {

	static Scanner sc=new Scanner(System.in);
	static double amount;//amount of bill
	static int unit; //consumption of electricity
	static int choice;
	public static void main(String[] args) {
		
	    choice=customerType();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the units: "); //Taking the input from user
		    unit=sc.nextInt();
			System.out.println("Total Electricity Bill : "+domesticBilling(unit));//call to demoesticBilling method
			break;
		case 2:
			System.out.println("Enter the units: "); //Taking the unit consumption
		    unit=sc.nextInt();
			System.out.println("Total Electricity Bill : "+industrialBilling(unit)); //call to industrialBilling method
			break;
		case 0:
			System.out.println("Thank you for visit!!");
			break;
		default :
			System.out.println("You have entered wrong choice..");
			break;
		}
		

	}
	public static int customerType()
	{
		try{
			System.out.println("Enter the Choice :\nEnter 1 for Domestic \nEnter 2 for Industrial\nEnter 0 for Exit ");
		    choice=sc.nextInt();
		    return choice;
		}catch(Exception e)
		{
			System.out.println("Invalid Choice..");
		}
		return choice;
		
	}
	
	public static double domesticBilling(int unit)
	{
		if(unit<=100)
			amount=unit * 1;  //calculate the bill by multiplying unit by 1
		else if (unit>100 && unit < 200)
			amount=unit * 1.5;  //calculate the bill by multiplying unit by 1.5
		else if (unit >=200 && unit <500)
			amount=unit * 2;  //calculate the bill by multiplying unit by 2
		else
			amount=unit * 5;
		return amount;  //calculate the bill by multiplying unit by 5
	}
	public static double industrialBilling(int unit)
	{
		
		amount=unit * 10; //calculate the bill by multiplying unit by 10
		return amount;
	}

}
