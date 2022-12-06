package com.nissan.app;

import java.util.Scanner;
import static com.nissan.util.AssetValidationUtil.*;
import com.nissan.pojo.Asset;

public class AssetApp {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System. in)) {
			
			System.out.print("Enter the number of Assets: ");
			int assetNumbers = scan.nextInt();
			
			Asset[] assetArr = new Asset[assetNumbers];
			
			
			
			System.out.println("Enter the Asset details: "); 
			for(int i = 0; i < assetArr.length; i++) {
				System.out.println("Enter Computer's name: ");
				scan.nextLine();
				String computerName = scan.nextLine();
				
				System.out.println("Enter Brand's name: ");
				String brandName = scan.nextLine();
				
				System.out.println("Enter Manufacturing date (yyyy-MM-dd): ");
				String manufactureDate = scan.nextLine();
				
				System.out.println("Enter availability status (y/n): ");
				char availability = scan.next().toLowerCase().charAt(0);
				
				System.out.println("Enter quantity: ");
				int quantity = scan.nextInt();
				
				boolean availabilityStatus = false; 
				if(availability == 'y') {
					availabilityStatus = true;
				}
				
				assetArr[i] = setAssetDetails(computerName, brandName, manufactureDate, availabilityStatus, quantity);
				
			}
			
			for(Asset asset : assetArr) {
				System.out.println(asset);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
