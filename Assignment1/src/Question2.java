import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) 
	{
     /* 2. Ramu visited the bookstore to buy books for his kid.
      *  He bought notebooks for Rs.100 and magic pot for Rs.50.
      *  How much money did Ramu spend in the bookstore? */
      
		System.out.println("Enter the notebooks amount : ");
		Scanner sc=new Scanner (System.in);
		int notebookPrice=sc.nextInt();
		System.out.println("Enter magic pot amount :");
		int potamount=sc.nextInt();
		totalAmount(notebookPrice,potamount);
		sc.close();
	}

	public static void totalAmount(int notebookPrice,int potamount)
	{
		System.out.println("Total Amount : "+(notebookPrice+potamount)+"/- Rs");
	}
}
