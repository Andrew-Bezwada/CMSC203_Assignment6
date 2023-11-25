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

public class Customer {
	
	String name;
	int age;
	
	public Customer(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public Customer(Customer c) {
		
		name = c.name;
		age = c.age;
		
	}
	
	public int getAge() {
		
		return age;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public String toString() {
		
		return name + "," + age;
		
	}

}
