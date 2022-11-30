import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		/*  Implement a logic to swap two numbers without using a temporary variable.
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int firstNum=sc.nextInt();
		System.out.println("Enter Second Number : ");
		int secondNum=sc.nextInt();
		interChange(firstNum,secondNum);
		sc.close();

	}
	public static void interChange(int firstNum, int secondNum)
	{
		firstNum=firstNum+secondNum;
		secondNum=firstNum-secondNum;
		firstNum=firstNum-secondNum;
		System.out.println("FirstNum : "+firstNum);
		System.out.println("SecondNum : "+secondNum);
	}
}
