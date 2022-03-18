package com.qa;

public class Vehicle {
	
	private int id;
	private String make;
	private String model;
	private int yearOfRelease;

	public Vehicle() {
		super();
	}
	
	public Vehicle(int id, String make, String model, int yearOfRelease) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.yearOfRelease = yearOfRelease;
	}

	public void go(String started) {
		System.out.println("The car has " + started);
	}
	
	public void stop(String stopped) {
		System.out.println("The car has " + stopped);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
}