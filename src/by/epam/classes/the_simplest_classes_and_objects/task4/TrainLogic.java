package by.epam.classes.the_simplest_classes_and_objects.task4;

import java.util.Comparator;

public class TrainLogic {

	public static class ByNumberComparator implements Comparator<Train> {

		@Override
		public int compare(Train left, Train right) {
			return left.getTrainNumber() - right.getTrainNumber();
		}

	}

	public static class ByDestinationAndTimeComparator implements Comparator<Train> {

		@Override
		public int compare(Train left, Train right) {
			if (left.getDestination() == right.getDestination())
				return left.getDepartureTime().compareTo(right.getDepartureTime());
			return left.getDestination().compareTo(right.getDestination());
		}

	}

	public static int trainTrue(int nowTrainNumber, Train[] trains) {

		for (int i = 0; i < trains.length; i++)
			if (nowTrainNumber == trains[i].getTrainNumber())
				return i;

		return -1;

	}

}
