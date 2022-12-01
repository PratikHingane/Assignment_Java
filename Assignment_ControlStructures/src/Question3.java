import java.util.Scanner;

/*
 * Write a program that uses an if-else-if ladder to determine which season a particular
Month is in.
Months 1, 2 and 12 are come under winter season.
Months 3, 4 and 5 are come under spring season.
Months 6, 7 and 8 are come under summer season.
Months 9, 10 and 11 are come under autumn season.
Accept a number for month from user and print the result accordingly.

 */
public class Question3 {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int number= acceptMonth();
		checkMonth(number);

	}
	public static int acceptMonth()
	{
		System.out.println("Enter the number for Month : \n1.January\n2.February\n3.March\n4.April\n5.May\n6.June\n7.July\n8.August\n9.Septeber\n10.Octomber\n11.November\n12.December");
		int acceptMonth=sc.nextInt();
		return acceptMonth;
		
	}
	public static void checkMonth(int acceptMonth)
	{
		if(acceptMonth==1||acceptMonth==2||acceptMonth==12)
			System.out.println("Winter Season!");
		
		else if(acceptMonth==3||acceptMonth==4||acceptMonth==5)
			System.out.println("Spring Season!");
		
		else if(acceptMonth==6||acceptMonth==7||acceptMonth==8)
			System.out.println("Summer Season!");
		
		else 
			System.out.println("Autumn Season!");
	}

}
