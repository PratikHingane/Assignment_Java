import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		/* The distance between two cities (KM) is input through the keyboard.
		 *  Write a program to convert and print this distance in meters, feet,
		 *   inches and centimeters.
		 */
		
		System.out.println("Enter distance between Nagpur and Thiruvanantpuram : ");
		Scanner sc=new Scanner(System.in);
		double distance =sc.nextDouble();
		distInMtr(distance);
		distInFeet(distance);
		distInInches(distance);
		distInCm(distance);
		sc.close();
		

	}
	public static void distInMtr(double distance)
	{
		double meter= distance*1000 ;
		System.out.println("Distance in Meters : "+meter);
	}
	public static void distInFeet(double distance)
	{
		double feet= distance*3280.84 ;
		System.out.println("Distance in Feets : "+feet);
	}
	public static void distInInches(double distance)
	{
		double inches= distance*39370.1 ;
		System.out.println("Distance in Inches : "+inches);
	}
	public static void distInCm(double distance)
	{
		double cm= distance*100000 ;
		System.out.println("Distance in Centimeters : "+cm);
	}
	

}
