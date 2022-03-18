package com.qa;

public class Saloon extends Vehicle {

	private int numOfDoors;
	private int numOfWheels;

	private Saloon(int numOfDoors, int numOfWheels) {
	
		this.numOfDoors = numOfDoors;
		this.numOfWheels = numOfWheels;
	
	}

	public void changeGear() {
		System.out.println(this.getModel() + " changed gear");
	}

	public void Accelerate() {
		System.out.println(this.getModel() + " accelerated");
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
}