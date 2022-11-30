import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		/*7. Raju’s basic salary is given. His dearness allowance is 40% of the basic salary and
		 *  house rent allowance is 20%. 
		 * Calculate his total salary.
		 */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Basic Salary :");
        double basicSalary=sc.nextDouble();
        totalSalary(basicSalary);
        sc.close();
	}
	public static void totalSalary(double basicSalary)
	{
		double totalSalary=basicSalary + 0.4*basicSalary+ 0.2*basicSalary ;
		System.out.println("Total Salary : "+totalSalary);
	}

}
