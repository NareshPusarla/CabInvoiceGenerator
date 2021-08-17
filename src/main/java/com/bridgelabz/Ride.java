package com.bridgelabz;

public class Ride {
	public double distance;

	public int timeInMins;
	
	public String Category;

	public Ride(double distance, int timeInMins) {
		super();
		this.distance = distance;
		this.timeInMins = timeInMins;
	}

	public Ride(double distance, int timeInMins, String category) {
		super();
		this.distance = distance;
		this.timeInMins = timeInMins;
		Category = category;
	}


	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getTimeInMins() {
		return timeInMins;
	}

	public void setTimeInMins(int timeInMins) {
		this.timeInMins = timeInMins;
	}

}
