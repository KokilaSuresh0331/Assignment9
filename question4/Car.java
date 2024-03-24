package com.assignment9.question4;

public class Car extends Vehicle {
	private int numDoors;

	public Car(String brand, String model, int numDoors) {
		super(brand, model);
		this.numDoors = numDoors;
	}

	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("Number of Doors: " + numDoors);
	}

}
