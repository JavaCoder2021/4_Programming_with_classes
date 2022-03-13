package by.epam.classes.the_simplest_classes_and_objects.task4;

import java.util.Comparator;
import java.util.List;

public class TrainLogic {

	public class ByNumberComparator implements Comparator<Train> {

		@Override
		public int compare(Train left, Train right) {
			return left.getTrainNumber() - right.getTrainNumber();
		}

	}

	public class ByDestinationAndTimeComparator implements Comparator<Train> {

		@Override
		public int compare(Train left, Train right) {
			if (left.getDestination() == right.getDestination())
				return left.getDepartureTime().compareTo(right.getDepartureTime());
			return left.getDestination().compareTo(right.getDestination());
		}

	}

	public Train findByNumber(int nowTrainNumber, List<Train> trains) {
		
		Train train = null;

		for (Train nowTrain : trains)
			if (nowTrainNumber == nowTrain.getTrainNumber()) {
				train = nowTrain;
				break;
			}

		return train;

	}

}
