package com.nt.oop;

public class Bike {
	String bikeNo;
	String color;
	String ownerName;
	String engNum;
	public Bike(String color, String engNum) {
		this.color = color;
		this.engNum = engNum;
	}
	void setBikeNom(String bikeNo) {
		this.bikeNo=bikeNo;
	}
	void setOwnerName(String ownerName) {
		this.ownerName=ownerName;
	}
	void start() {
		System.out.println(ownerName+" Bike is started");
	}
	void stop() {
		System.out.println(ownerName+" Bike is Stopped");
	}
	void move() {
		System.out.println(ownerName+" Bike Is Moved");
	}

}
