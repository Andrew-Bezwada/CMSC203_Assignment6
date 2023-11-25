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

public class Coffee extends Beverage{
	
	boolean extraShot;
	boolean extraSyrup;
	final double SHOT_PRICE = .5;
	final double SYRUP_PRICE = .5;
	
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		
		super(bevName, Type.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
		
	}
	
	public boolean getExtraShot() {
		
		return extraShot;
		
	}
	
	public boolean getExtraSyrup() {
		
		return extraSyrup;
		
	}
	
	public double calcPrice() {
		
		double price = super.addSizePrice();
		
		if(extraShot == true)
			
			price += SHOT_PRICE;
		
		else if(extraSyrup == true)
			
			price += SYRUP_PRICE;
		
		return price;
		
	}
	
	public String toString() {
		
		String toReturn = super.toString();
		toReturn += "," + extraShot + "," + extraSyrup + "," + calcPrice();
		return toReturn;
		
	}
	
	public boolean equals(Coffee anotherBev) {
		
		if(super.equals(anotherBev) == true && extraShot == anotherBev.extraShot && extraSyrup == anotherBev.extraSyrup)
			
			return true;
		
		else
			
			return false;
		
	}

}


