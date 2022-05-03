package by.epam.classes.aggregation_and_composition.task5;

import java.util.*;

public class TourAgencyLogic {

	List<Tour> tours = new ArrayList<Tour>();

	public List<Tour> pickUpTours(TourTransport transport, boolean food, int fromDays, int toDays,
			int fromCost, int toCost, TourAgency tourAgency) {

		tours.clear();

		for (Tour tour : tourAgency.getTours())
			if (transport == tour.getTransport() && food == tour.isFood()
					&& (fromDays <= tour.getNumberOfDays() && toDays >= tour.getNumberOfDays())
					&& (fromCost <= tour.getCost() && toCost >= tour.getCost()))
				tours.add(tour);

		return tours;

	}

	public void sortToursByDays(TourAgency tourAgency) {

		Collections.sort(tourAgency.getTours(), new Comparator<Tour>() {
			@Override
			public int compare(Tour left, Tour right) {
				return left.getNumberOfDays() - right.getNumberOfDays();
			}
		});

	}

	public void sortToursByCost(TourAgency tourAgency) {

		Collections.sort(tourAgency.getTours(), new Comparator<Tour>() {
			@Override
			public int compare(Tour left, Tour right) {
				return left.getCost() - right.getCost();
			}
		});

	}

}