import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		/*3. Read two numbers, divide the first number by the second and
		 *  print the quotient and remainder.*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number :");
		int firstNum=sc.nextInt();
		System.out.println("Enter Second Number :");
		int secondNum=sc.nextInt();
		quotientAndRemainder(firstNum,secondNum);
		sc.close();

	}
	public static void quotientAndRemainder(int firstNum, int secondNum)
	{
		int quotient=firstNum/secondNum;
		System.out.println("Quotient : "+quotient);
		int remainder=firstNum%secondNum;
		System.out.println("Remainder : "+remainder);
	}

}
