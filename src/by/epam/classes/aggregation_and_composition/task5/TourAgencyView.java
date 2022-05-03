package by.epam.classes.aggregation_and_composition.task5;

import java.util.*;

public class TourAgencyView {

	public void printTours(List<Tour> tours) {

		for (Tour tour : tours)
			System.out.println(tour);

	}

	public void printTour(Tour tour) {

		System.out.println(tour);

	}

}