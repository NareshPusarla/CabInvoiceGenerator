package com.bridgelabz;

public class Ride {
	public double distance;

	public int timeInMins;

	public Ride(double distance, int timeInMins) {
		super();
		this.distance = distance;
		this.timeInMins = timeInMins;
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
