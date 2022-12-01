import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number : ");
		final float number=sc.nextFloat();
		System.out.println("After typecasting number becomes : "+ (int) number);
		}
		catch(Exception e)
		{
			System.out.println("Invalid entry");
		}
	}

}
