package com.bridgelabz;

public class InvoiceDetails {
	int totalRides;
	int totalFare;
	double avgFarePerRide;
	
	public InvoiceDetails(int totalRides, int totalFare, double avgFarePerRide) {
		super();
		this.totalRides = totalRides;
		this.totalFare = totalFare;
		this.avgFarePerRide = avgFarePerRide;
	}

	public int getTotalRides() {
		return totalRides;
	}

	public void setTotalRides(int totalRides) {
		this.totalRides = totalRides;
	}

	public int getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(int totalFare) {
		this.totalFare = totalFare;
	}

	public double getAvgFarePerRide() {
		return avgFarePerRide;
	}

	public void setAvgFarePerRide(double avgFarePerRide) {
		this.avgFarePerRide = avgFarePerRide;
	}
	
	
}
