/*
 * Class: CMSC203 CRN 22557 
 * Program: Assignment 6 Implementation 
 * Instructor: Prof. Kuijt 
 * Summary of Description: Write an application that lets the user order Alcohol, Coffee, or Smoothies.
 * If the user is under 18, access to Alcohol is barred.   
 * Due Date: 11/26/2023 
 * Integrity Pledge: I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * Student: Andrew Bezwada 
 */

package application;

public class Alcohol extends Beverage {
	
	boolean isWeekend;
	final double WEEKEND_PRICE = .60;
	
	public Alcohol(String bevName, Size size, boolean isWeekend) {
		
		super(bevName, Type.ALCOHOL, size);
		this.isWeekend = isWeekend;
		
	}
	
	public double calcPrice() {
		
		double price = super.addSizePrice();
		
		if(isWeekend == true)
			
			price += WEEKEND_PRICE;
		
		return price;
		
	}
	
	public String toString() {
		
		String toReturn = super.toString();
		toReturn += "," + isWeekend + "," + calcPrice();
		return toReturn;
		
	}
	
	public boolean equals(Alcohol anotherBev) {
		
		if(super.equals(anotherBev) == true && isWeekend == anotherBev.isWeekend)
			
			return true;
		
		else 
			
			return false;
		
	}

}
