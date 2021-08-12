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
		return totalFare;
	}
}
