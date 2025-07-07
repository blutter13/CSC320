package csc320;

import java.io.File;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;

public class automobileInventory {
	public static void main (String[] args) {
		Scanner scnr = new Scanner(System.in);
		try {
			automobile autoCar = new automobile("Toyota", "Camry", "Silver", 2009, 172000);
			String autoInfo[] = autoCar.listInfo();
			for(int i = 0; i < 5; i++) {
				System.out.print(autoInfo[i] + " | ");
				
			}
			System.out.println("\n"+autoCar.removeVehicle());
			autoCar.addVehicle();
			autoInfo = autoCar.listInfo();
			for(int i = 0; i < 5; i++) {
				System.out.print(autoInfo[i] + " | ");
				
			}
			System.out.println("Print information to file?");
			String input = scnr.nextLine();
			if(input.equalsIgnoreCase("y")) {
				File carInfo = new File("carinfo.txt");
				FileOutputStream carStream = new FileOutputStream(carInfo);
				String carWrite = "Make: " + autoInfo[0] + " Model: " + autoInfo[1] + " Color: " + autoInfo[2] + " Year: " + autoInfo[3] + " Mileage: " + autoInfo[4];
				carStream.write(carWrite.getBytes());
				System.out.println("Information printed to file.");
			}
			
			else if(input.equalsIgnoreCase("n")) {
				System.out.println("Information not printed to file.");
			}
			
			else {
				System.out.println("Invalid answer, information not printed to file.");
			}
		}
		catch (Exception e) { 
			System.out.println("Encountered an exception during execution.");
		}
		
		
		
	}
}
