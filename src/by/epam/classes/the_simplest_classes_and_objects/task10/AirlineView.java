package by.epam.classes.the_simplest_classes_and_objects.task10;

import java.util.List;

public class AirlineView {
	
	public void print(List<Airline> airlines) {

		for (Airline airline : airlines)
			System.out.println(airline);

	}

	public void print(Airline airline) {

		System.out.println(airline);

	}

}