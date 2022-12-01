import java.util.Scanner;

/*
 * Create a menu driven program using do-while and switch-case which implements a help system for Java’s selection and iteration statements. You have to display the syntax of selected control statement.
Help on:

1. if

2. switch

3. while

4. do-while

5. for

Choose one:

4

The do-while:

do {

statement;

 } while (condition);
 */
public class Question5 {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int choice=menulist();
		
		do {
			
			System.out.println("Welcome to Menu-Driven Program of Help..");
			switch(choice) {
			case 1:
				System.out.println("You choosed help for'if' conditional statement");
				System.out.println("if(condition)\n{\nstatements;\n\n}\nelse{\nstatements;\n}\n");
				break;
			case 2:
				System.out.println("You choosed help for'switch' conditional statement");
				System.out.println("switch() \n{ \n case 1: \nbreak;\n case 2: \nbreak;\n");
				break;
			case 3:
				System.out.println("You choosed help for'while' conditional statement");
				System.out.println("while(condition)\n{\nstatements;\n\n}");
				break;
			case 4:
				System.out.println("You choosed help for'do-while' conditional statement");
			    System.out.println("do {\r\n"
			    		+ "\r\n"
			    		+ "statement;\r\n"
			    		+ "\r\n"
			    		+ " } while (condition);");
			break;
			case 0:
				System.out.println("Thank you!!");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
				
					
			}choice=menulist();
		}
		while(choice!=0);
	

	}
	public static int menulist()
	{
		int choice;
		System.out.println("Enter the choice");
		System.out.println("0.Exit\n1.if\n2.switch\n3.while\n4.do-while\n5.for");
		choice=sc.nextInt();
		return choice;
	}

}
