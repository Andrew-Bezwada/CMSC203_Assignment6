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
public class BevShopDriverApp {

	public static void main(String[] args) {
		BevShop bevShop = new BevShop();

		System.out.println("The current order in process cannot have more than " + bevShop.getMaxOrderForAlcohol() + " alcoholic beverages.");
		System.out.println("The minimum age to order an alcoholic drink is " + bevShop.getMinAgeForAlcohol() + "\n");

		// This is the first order
		bevShop.startNewOrder(12, Day.FRIDAY, "Ryan", 47);
		
		// A new customer object is created here
		Customer customerOne = bevShop.getCurrentOrder().getCustomer();

		System.out.println("Start a new order:");
		System.out.println("Your Total Order for now is " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));
		System.out.println("Please enter your name: " + customerOne.getName());
		System.out.println("Now please enter your age: " + customerOne.getAge());
		
		// This is the first if loop to determine Alcohol eligibilty
		if (customerOne.getAge() >= bevShop.getMinAgeForAlcohol()) {
			
			System.out.println("Your age is above " + bevShop.getMinAgeForAlcohol() + " so you are eligible to order alcohol");
			
		} 
		
		else {
			
			System.out.println("Your age is not appropriate for alcohol drink!");
			
		}

		System.out.println("Would you please add an Alcoholic Drink to order ");
		
		// This is another if loop to determine Alcohol eligibilty
		if (customerOne.getAge() >= bevShop.getMinAgeForAlcohol()) {

			bevShop.processAlcoholOrder("Green Tea Shot", Size.MEDIUM);

		} 
		
		else {
			
			System.out.println("Your age is below the minimum for alcoholic drinks!");
		
		}

		System.out.println("Would you like to add a Smoothie to your order: ");
		bevShop.processSmoothieOrder("Kiwi Smoothie", Size.LARGE, 2, true);

		System.out.println("Would you like to add a Coffee to your order: ");
		bevShop.processCoffeeOrder("Chocolate Latte", Size.SMALL, false, false);
		

		System.out.println("The total items on your order is: " + bevShop.getCurrentOrder().getTotalItems());
		System.out.println("The total price on your order is: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

		// This is where another order is added
		bevShop.startNewOrder(1, Day.SATURDAY, "Walker", 14);
		Customer customerTwo = bevShop.getCurrentOrder().getCustomer();

		System.out.println("#------------------------------------#");
		System.out.println("Start a new order");
		System.out.println("Please enter your name: " + customerTwo.getName());
		System.out.println("Now please enter your age: " + customerTwo.getAge());

		System.out.println("Would you like to add an Alcoholic Drink to your order: ");

		// This is the first if loop to determine Alcohol eligibilty (for the second customer)
		if (customerTwo.getAge() >= bevShop.getMinAgeForAlcohol()) {
			
			System.out.println("Your age is above " + bevShop.getMinAgeForAlcohol() + " so you are eligible to order alcohol");
			bevShop.processAlcoholOrder("Wine", Size.MEDIUM);
		
		} 
		
		else {
			
			System.out.println("Your age is below the minimum for alcoholic drinks!");
			
		}
		
		System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

		System.out.println("Would you like to add a Smoothie to order: ");
		bevShop.processSmoothieOrder("Strawberry Smoothie", Size.LARGE, 4, false);
		
		System.out.println("Would you like to add a Coffee to order: ");
		bevShop.processCoffeeOrder("Iced Coffee", Size.MEDIUM, false, true);

		System.out.println("Would you like to add a Coffee to order: ");
		bevShop.processCoffeeOrder("Small Coffee", Size.SMALL, false, true);

		System.out.println("\nTotal price for the second order: " + bevShop.totalOrderPrice(bevShop.getOrderAtIndex(1).getOrderNo()));
		System.out.println("Total amount for all orders: " + bevShop.totalMonthlySale());

		// This is where the toString from bevShop is used
		System.out.println("\n" + bevShop.toString());
		
	}
	
}