import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		/* 6. Two numbers are stored in locations i and j. 
		 * Write a program to interchange the numbers.
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
		int temp = 0;
		temp=firstNum;
		firstNum=secondNum;
		secondNum=temp;
		System.out.println("First Number :"+firstNum);
		System.out.println("Second Number :"+secondNum);
		
		
	}

}
