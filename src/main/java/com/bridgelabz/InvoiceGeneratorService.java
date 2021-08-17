package com.bridgelabz;

import java.util.List;

public class InvoiceGeneratorService {
	double totalFare = 0;

	public double calculateFare(double distance, int time) {
		double fare = (distance * 10) + (time * 1);

		if (fare == 0.0)
			return 0;
		else if (fare < 5.0)
			return 5.0;

		return fare;
	}

	public double calculateFareForAllRides(List<Ride> rides) {
		for (Ride ride : rides) {
			totalFare += calculateFare(ride.getDistance(), ride.getTimeInMins());
		}
		System.out.println(totalFare);
		return totalFare;
	}

	public double calculatePremiumRide(double distance, int time, String category) {
		double Fare = 0;
		if (category.equals("Normal")) {
			Fare = (distance * 10) + (time * 1);
		} else if (category.equals("Premium")) {
			Fare = (distance * 15) + (time*2);
		}
		return Fare;
	}
	
	public double calculateFareForAllPremiumRides(List<Ride> premiumRides) {
		for (Ride ride : premiumRides) {
			totalFare += calculatePremiumRide(ride.getDistance(), ride.getTimeInMins(),ride.Category);
		}
		System.out.println(totalFare);
		return totalFare;
		
	}
}
