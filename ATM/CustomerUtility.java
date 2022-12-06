import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CustomerUtility {

	public static void getInputFromUser() {
		Scanner scan = new Scanner(System.in);
		String[] customerNames = new String[5];
		double[] accountBalances = new double[5];
		Date[] arrDob = new Date[5];

		char choice = 'n';
		int i = 0;
		try {
			do {
				System.out.println("Enter customer name: ");

				String temp = setValidCustomerName(scan.nextLine());

				// check name for duplicate
				if (checkCustomerNameExists(temp, customerNames)) {
					System.out.println("Customer already exists");
				} else {
					customerNames[i++] = temp;
				}

				// Account Balance
				System.out.println("Enter opening balance: ");

				// continue
				System.out.println("Do you want to continue (y/n)? ");
				choice = scan.nextLine().charAt(0);
			} while (choice == 'y' || choice == 'Y');
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static String setValidCustomerName(String nextLine) {
		// TODO Auto-generated method stub
		return null;
	}

	private static boolean checkCustomerNameExists(String name,
			String[] customerNames) {
		// check exists
		for (String customerName : customerNames) {
			if (name.equals(customerName)) {
				return true;
			}
		}
		return false;
	}

	private static double setAccountBalance(double balance) {
		try {
			BufferedReader brRead = new BufferedReader(new InputStreamReader(
					System.in));

			do {
				if (balance < 1000) {
					System.out.println("Sorry!!! Min. balance is 1000!!!");
				}
			} while (true);
		} finally {

		}
	}

	private static Date convertStringToUtilDate(String joinDate)
			throws ParseException {
		Date utilDate = new SimpleDateFormat("dd/MM/yyyy").parse(joinDate);

		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		return utilDate;
	}
	
	private static void displayOutput() {
		try{
			System.out.println("Press x key to see customer into details: ");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
