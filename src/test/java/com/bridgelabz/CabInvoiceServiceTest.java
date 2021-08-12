package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CabInvoiceServiceTest {
	InvoiceGeneratorService iservice = new InvoiceGeneratorService();
	
	@Test
	public void testCalculatorFare() {
		final double distance = 100;
		final int time = 50;
		
		double fare = iservice.calculateFare(distance, time);
		assertEquals(1050, fare, 0);
	}
	
	@Test
	public void testCalculatorForAllRides() {
		List<Ride> ride = new ArrayList<Ride>();
		
		Ride ride1 = new Ride(30, 5);
		Ride ride2 = new Ride(100, 50);
		
		ride.add(ride1);
		ride.add(ride2);
		
		double totalFare = iservice.calculateFareForAllRides(ride);
		assertEquals(1355, totalFare, 0);
	}
}
