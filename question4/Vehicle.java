package com.assignment9.question4;

public class Vehicle {
	private String brand;
	private String model;

	public Vehicle(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void displayInfo() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
	}
}
