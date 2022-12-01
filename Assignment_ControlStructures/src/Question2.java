import java.util.Scanner;

/*
 * You are a Software developer in XYZ Company and you are asked
 *  to create a program to verify a user’s PIN code when a user visits an ATM.
 *   To implement this concept, you must use decisional statements to make appropriate decisions
 *    when a use’s PIN code matches with the pin code assigned to that user. 
 *    For that, you have created a class named Verify, in which a user has to enter 
 *    some numeric value as the PIN code during runtime. 
 *    Apart from that, you have initialized a variable y with some numeric value and 
 *    compare the value stored in the variable y with the value accepted from a user.
 */
public class Question2 {

	static final int pin=2580;
	static int userPin;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the Pin: ");
		acceptPin();
		verifyPin();

	}
	public static int acceptPin()
	{
		
		userPin=sc.nextInt();
		return userPin;
	}
	public static void verifyPin()
	{
		if(userPin==pin)
		{
			System.out.println("Pin matched successfully!!");
		}
		else
			System.out.println("Incorrect pin!\nTry Again...");
	}

}
