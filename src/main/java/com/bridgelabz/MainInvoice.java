package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainInvoice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Ride> rides = new ArrayList<Ride>();
		Ride ride1 = new Ride(50, 30);
		Ride ride2 = new Ride(100, 50);

		rides.add(ride1);
		rides.add(ride1);

		List<Ride> premiumRides = new ArrayList<Ride>();
		Ride premiumRide1 = new Ride(50,30,sc.next());
		Ride premiumRide2 = new Ride(100,50,sc.next());
		
		premiumRides.add(premiumRide1);

		InvoiceGeneratorService invoice = new InvoiceGeneratorService();

		invoice.calculateFareForAllRides(rides);
		invoice.calculateFareForAllPremiumRides(premiumRides);
	}

}
