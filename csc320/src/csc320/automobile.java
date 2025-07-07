package csc320;

import java.util.Scanner;

public class automobile {
	private String model;
	private String make;
	private String color;
	private int year;
	private int mileage;
	private String vin;
	Scanner scnr = new Scanner(System.in);
	
	automobile() {
		this.model = "";
		this.make = "";
		this.color = "";
		this.year = 0;
		this.mileage = 0;
		
	}
	automobile(String model, String make, String color, int year, int mileage){
	this.model = model;
	this.make = make;
	this.color = color;
	this.year = year;
	this.mileage = mileage;
	}
	
	public String addVehicle() { 
		try {
			System.out.println("Enter make:");
			this.make = scnr.nextLine();
			System.out.println("Enter model:");
			this.model = scnr.nextLine();
			System.out.println("Enter color:");
			this.color = scnr.nextLine();
			try {
				System.out.println("Enter year:");
				this.year = scnr.nextInt();
			}
			catch (Exception e) { 
				System.out.println("Failed to add, please try again. Use only numbers. Enter year:");
				this.year = scnr.nextInt();				
			}
			try {
				System.out.println("Enter mileage:");
				this.mileage = scnr.nextInt();
			}
			catch (Exception e) { 
				System.out.println("Failed to add, please try again. Use only numbers. Enter mileage:");
				this.mileage = scnr.nextInt();				
			}
			return("Added vehicle successfully.");
		}
		
		catch(Exception e) {
			return("Error adding vehicle.");
		}
	}
	public String[] listInfo() {
		try {
			return new String[] {this.make, this.model, this.color, String.valueOf(this.year), String.valueOf(this.mileage)};
		}
		catch(Exception e) {
			System.out.println("Failed to list info.");
			return new String[] {"Failed to list info.", "", "","", ""};
		}
	}
	public String removeVehicle() {
		try {
			this.make = "";
			this.model = "";
			this.color = "";
			this.year = 0;
			this.mileage = 0;
			return("Successfully removed vehicle data.");
		}
		
		catch(Exception e) {
			return("Error removing vehicle.");
		}
	}
	
	public String updateVehicle(String autoMake, String autoModel, String autoColor, int autoYear, int autoMileage) {
		try {
			
			this.make = autoMake;
			this.model = autoModel;
			this.color = autoColor;
			this.year = autoYear;
			this.mileage = autoMileage;
			return("Successfully updated vehicle.");
		}
		
		catch(Exception e) {
			return("Error updating vehicle.");
		}
		}
	}
	
