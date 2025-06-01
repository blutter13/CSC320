package csc320;
import java.util.Scanner;
//Benjamin Lutter CSC320 Module 3 Critical Thinking
public class csc320mod3 {
	public static void main(String[] args) {
		// Instantiate scanner, declare variables 
		Scanner scnr = new Scanner(System.in);	
		double income;
		double tax;
		//Obtaining user input for income
		System.out.println("Enter income: ");
		income = scnr.nextDouble();
		//Selection structure to calculate correct tax bracket
		if (income < 500) {
			tax = income * 0.1;
			income = income + tax;
			String formatTax = String.format("%.2f", tax);
			System.out.println("Tax rate is 10%, Tax Amount: " + formatTax + "| Total: " + income);
		}
		else if (income > 500 && income < 1500) {
			tax = income * 0.15;
			income = income + tax;
			String formatTax = String.format("%.2f", tax);
			System.out.println("Tax rate is 15%, Tax Amount: " + formatTax + "| Total: " + income);
		}
		else if (income > 1500 && income < 2500) { 
			tax = income * 0.2;
			income = income + tax;
			String formatTax = String.format("%.2f", tax);
			System.out.println("Tax rate is 20%, Tax Amount: " + formatTax + "| Total: " + income);
		}
		else if (income > 2500) {
			tax = income * 0.3;
			income = income + tax;
			String formatTax = String.format("%.2f", tax);
			System.out.println("Tax rate is 30%, Tax Amount: " + formatTax + "| Total: " + income);
		}
	}
		
}

