import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		/*5. The temperature of a city in Fahrenheit is given. 
		 * Write a program to convert it into Celsius.
		 */
		
		System.out.println("Enter the temperature in Farenheit : ");
		Scanner sc=new Scanner(System.in);
		double farenheit=sc.nextDouble();
		farenheitToCelsius(farenheit);
		sc.close();

	}
	public static void farenheitToCelsius(double farenheit)
	{
		double Celsius = ((farenheit - 32) * 5)/9 ;
	    System.out.println("Temp in Celsius : "+Celsius);
	}

}
