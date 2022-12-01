import java.util.Scanner;

/*
 * Rewrite the above program using switch-case
 */
public class Question4 {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int choice =acceptMonth();
		switch(choice)
		{
		case 1:
				System.out.println("Winter Season!");
				break;
		case 2:
			System.out.println("Winter Season!");
			break;
		case 3:
			System.out.println("Spring Season!");
			break;
		case 4:
			System.out.println("Spring Season!");
			break;
		case 5:
			System.out.println("Spring Season!");
			break;
		case 6:
			System.out.println("Summer Season!");
			break;
		case 7:
			System.out.println("Summer Season!");
			break;
		case 8:
			System.out.println("Summer Season!");
			break;
		case 9:
			System.out.println("Autumn Season!");
			break;
		case 10:
			System.out.println("Autumn Season!");
			break;
		case 11:
			System.out.println("Autumn Season!");
			break;
		case 12:
			System.out.println("Winter Season!");
			break;
		default:
			System.out.println("Invalid Choice");
				
		}
      
	}
	public static int acceptMonth()
	{
		System.out.println("Enter the number for Month : \n1.January\n2.February\n3.March\n4.April\n5.May\n6.June\n7.July\n8.August\n9.Septeber\n10.Octomber\n11.November\n12.December");
		int choice=sc.nextInt();
		return choice;
	}

}
