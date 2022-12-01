
import java.util.Scanner;

/*You have been asked to develop a Java application for railway department, which will automate 
 * the seat booking process for a particular train. In the existing scenario, passengers fill the 
 * booking request form with the following details.
a) Train id
b) Train Name
c) Passenger Name
Based on the availability, the railway officer reserves the seat and gives seat conformation. 
Write a java program that will show the process of seat conformation for the passengers of a particular train.
In this task, you will create the SeatReservation class, in which train id is given by the 
user at the runtime, and the train name and passenger name are given at the compile time. 
After compiling and executing the SeatReservation class, the method of the SeatReservation class will
 show seat conformation or non-conformation on the basis of the train id given by the user.

 */
public class Question11 {

	public static void main(String[] args) {
		SeatReservation passenger=new SeatReservation();
		passenger.Accept();

	}

}
class SeatReservation{
	private int trainId;
	private String trainName;
	private String passengerName;
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	
	public void Accept()
	{
		try
		{
			Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Train id : ");
		this.setTrainId(sc.nextInt());
		System.out.println("Enter Train name: ");
		this.setTrainName(sc.next());
		System.out.println("Enter Passenger name : ");
		this.setPassengerName(sc.next());
		confirmation();
		}
		catch(Exception e)
		{
			System.out.println("Enter correct data");
		}
	}
	public void confirmation()
	{
		if(this.getTrainId()==43256)
			System.out.println("Hurray !! Your seat is confirmed");
		else
			System.out.println("OOPS!! Your seat is not confirmed");
	}
}
