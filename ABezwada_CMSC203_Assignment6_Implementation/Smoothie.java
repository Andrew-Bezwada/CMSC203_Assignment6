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
 *  
 */

package application;

public class Smoothie extends Beverage{
	
	int numOfFruits;
	boolean addProtein;
	final double PROTEIN_PRICE = 1.50;
	final double FRUIT_PRICE = .5;
	
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) {
		
		super(bevName, Type.SMOOTHIE, size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
		
	}
	
	public int getNumOfFruits() {
		
		return numOfFruits;
		
	}
	
	public boolean getAddProtein() {

		return addProtein;
		
	}
	
	public String toString() {
		
		String toReturn = super.toString();
		toReturn += "," + addProtein + "," + numOfFruits + "," + calcPrice();
		return toReturn;
		
	}
	
	public double calcPrice() {
		
		double price = super.addSizePrice();
		price += numOfFruits * FRUIT_PRICE;
		
		if(addProtein == true)
			
			price += PROTEIN_PRICE;
		
		return price;
		
	}
	
	public boolean equals(Smoothie anotherBev) {
		
		if(super.equals(anotherBev) == true && numOfFruits == anotherBev.numOfFruits && addProtein == anotherBev.addProtein)
			
			return true;
		
		else
			
			return false;
		
	}

}
