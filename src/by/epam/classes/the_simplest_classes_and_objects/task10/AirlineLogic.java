package by.epam.classes.the_simplest_classes_and_objects.task10;

import java.util.*;

public class AirlineLogic {

	public List<Airline> sortByDestination(List<Airline> airlines, String destination) {

		List<Airline> sortedAirlines = new LinkedList<Airline>();

		for (Airline airline : airlines)
			if (destination.toLowerCase().equals(airline.getDestination().toLowerCase()))
				sortedAirlines.add(airline);

		return sortedAirlines;

	}

	public List<Airline> sortByDaysOfWeek(List<Airline> airlines, String dayOfWeek) {

		List<Airline> sortedAirlines = new LinkedList<Airline>();

		for (Airline airline : airlines)
			if (dayOfWeek.toLowerCase().equals(airline.getDaysOfWeek().toLowerCase()))
				sortedAirlines.add(airline);

		return sortedAirlines;

	}

	public List<Airline> sortByDepartureTime(List<Airline> airlines, String dayOfWeek, Double departureTime) {

		List<Airline> sortedAirlines = new LinkedList<Airline>();

		for (Airline airline : airlines)
			if (dayOfWeek.toLowerCase().equals(airline.getDaysOfWeek().toLowerCase())
					&& (Double.valueOf(airline.getDepartureTime()) > Double.valueOf(departureTime)))
				sortedAirlines.add(airline);

		return sortedAirlines;

	}

}