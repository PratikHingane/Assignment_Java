import java.util.Scanner;

public class Question1 {
	static double amount;
	public static void main(String[] args) {
		/* 1. For 10 oranges we have to pay Rs.45 what will be the price of 1 orange.
              You can set the status of your assignment here.*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of oranges you want : ");
		int oranges=sc.nextInt();
		System.out.println("Enter the total amount : ");
		double amount=sc.nextDouble();
		priceForOne(amount,oranges);
		
		sc.close();

	}
	
    public static void priceForOne(double amount,int oranges)
    {
    	double amountOfOne= amount/oranges ;
    	System.out.println("Amount of One Orange is : "+amountOfOne + "/- Rs");
    }
}
