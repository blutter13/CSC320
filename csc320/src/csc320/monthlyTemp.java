package csc320;

import java.util.Arrays;
import java.util.Scanner;

public class monthlyTemp {
	public static void main (String[] args) {
		Scanner scnr = new Scanner(System.in);
		//Initialize arrays
		String months[] = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int temps[] = new int[12];
		int tempSort[]= new int[12];
		int sum = 0;
		for(int i = 0; i < 12; i++) {
			System.out.println("Enter a temperature for the month of " + months[i]);
			temps[i] = scnr.nextInt();
			sum = sum + temps[i];
		}
		//Make sorted array to find lowest and highest values
		for (int i = 0; i < 12; i++) {
            tempSort[i] = temps[i];
		}
		Arrays.sort(tempSort);
		int lowTemp = tempSort[0];
		int highTemp = tempSort[11];
		
		scnr.nextLine();
		int avg = sum/12;
		System.out.println("Enter a month, or 'year' for a full report: ");
		String input = scnr.nextLine();
		//Switch statement to report monthly temp based on user input
		switch(input) {
		case "January": System.out.println("The average temperature for " + months[0] + " is " + temps[0]);
		case "February": System.out.println("The average temperature for " + months[1] + " is " + temps[1]);
		case "March": System.out.println("The average temperature for " + months[2] + " is " + temps[2]);
		case "April": System.out.println("The average temperature for " + months[3] + " is " + temps[3]);
		case "May": System.out.println("The average temperature for " + months[4] + " is " + temps[4]);
		case "June": System.out.println("The average temperature for " + months[5] + " is " + temps[5]);
		case "July": System.out.println("The average temperature for " + months[6] + " is " + temps[6]);
		case "August": System.out.println("The average temperature for " + months[7] + " is " + temps[7]);
		case "September": System.out.println("The average temperature for " + months[8] + " is " + temps[8]);
		case "October": System.out.println("The average temperature for " + months[9] + " is " + temps[9]);
		case "November": System.out.println("The average temperature for " + months[10] + " is " + temps[10]);
		case "December": System.out.println("The average temperature for " + months[11] + " is " + temps[11]);
		case "year" : System.out.println("Monthly Temperatures : " + temps[0] + ", " + temps[1] + ", " +temps[2] + ", " +temps[3] + ", " +temps[4] + ", " +temps[5] + ", " +temps[6] + ", " +temps[7] + ", " +temps[8] + ", " +temps[9] + ", " +temps[10] + ", " +temps[11] + " | Average Temperature: " + avg + " | Lowest Temperature: " + lowTemp + " | Highest Temperature: " + highTemp);
		}
		}
		
}
