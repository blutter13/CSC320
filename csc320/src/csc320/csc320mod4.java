package csc320;
import java.util.Scanner;
//Benjamin Lutter CSC320 Mod 4 Critical Thinking

public class csc320mod4 {
	public static void main(String[] args) {
		//Declare variables
		double total;
		double average;
		double interest;
		double first = 0;
		double second = 0;
		double third = 0;
		double fourth = 0;
		double fifth = 0;
		
		//Scanner
		Scanner scnr = new Scanner(System.in);
		
		int i = 0;
		while(i < 5) { 
			System.out.println("Enter next double: ");
			//Populate variables storing 5 doubles
			switch(i) { 
			case 0:
				first = scnr.nextDouble(); break;
			case 1:
				second = scnr.nextDouble(); break;
			case 2:
				third = scnr.nextDouble(); break; 
			case 3:
				fourth = scnr.nextDouble(); break;
			case 4:
				fifth = scnr.nextDouble(); break;
			}
			i = i + 1;
		}
		//Get total
		total = first + second + third + fourth + fifth;
		//Max, min, interest, and average
		double maximum = Math.max(Math.max(Math.max(first, second), third), Math.max(fourth, fifth));
		double minimum = Math.min(Math.min(Math.min(first, second), third), Math.min(fourth, fifth));
		double intrst = total + total * 0.2;
		double avg = total/5;
		System.out.println("Total: " + total + " | Maximum: " + maximum + " | Minimum: " + minimum + "| Total w/ 20% Interest: " + intrst + " | Average: " + avg);
	}
}
