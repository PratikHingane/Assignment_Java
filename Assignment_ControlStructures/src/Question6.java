import java.util.Scanner;

public class Question6 {

	
		private static Scanner sc= new Scanner(System.in);
	    public static void main(String[] args) {
	        try {
	        int input=acceptInput();
	        displaymatrix(input);
	        }catch(Exception e) {
	            System.out.println("Invalid input. Please try again.");
	        }



	   }



	   private static void displaymatrix(int input) {
	        for(int i=input;i>=0;i--) {
	            for(int j=i;j>0;j--) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }



	   private static int acceptInput() {
	        System.out.print("Enter a number: ");
	        int input=sc.nextInt();
	        return input;
	    }


	}


