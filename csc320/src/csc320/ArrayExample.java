package csc320;
import java.util.Scanner;

public class ArrayExample {
	public static void main (String[] args) {
	String[] input = new String[3];
	Scanner scnr = new Scanner(System.in);
	System.out.println("Please enter your name:");
	input[0] = scnr.nextLine();
	System.out.println("Please enter your surname:");
	input[1] = scnr.nextLine();
	System.out.println("Please enter your favorite color:");
	input[2] = scnr.nextLine();
	System.out.println("User's name is " + input[0] + input[1] + " and their favorite color is " + input[2]);
	
	}
	}
