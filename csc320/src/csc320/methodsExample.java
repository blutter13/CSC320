package csc320;

import java.util.Scanner;

public class methodsExample {
	
	public static void methodExample(int input) {
		int  myNumber = (int)(Math.random() * 10);
		System.out.println(myNumber);		
		if(input == myNumber) {
			System.out.println("You got it!");
		}
		else {
			System.out.println("You didn't get the number");
		}
		
	}

	public static void main (String[] args) {
		System.out.println("I'm thinking of a number... make a guess");
		Scanner scnr = new Scanner(System.in);
		int input = scnr.nextInt();
		methodExample(input);
	}
}
