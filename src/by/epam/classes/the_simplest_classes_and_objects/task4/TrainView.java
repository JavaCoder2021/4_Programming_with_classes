package by.epam.classes.the_simplest_classes_and_objects.task4;

import java.util.List;

public class TrainView {
	
	public void print(List<Train> trains) {

		for (Train train : trains)
			System.out.println(train);

	}

	public void print(Train train) {

		System.out.println(train);

	}

}
