package by.epam.classes.the_simplest_classes_and_objects.task4;

import java.util.LinkedList;
import java.util.List;

public class Depo {
	
	private List<Train> trains;
	
	{
		trains = new LinkedList();
	}
	
	public Depo() {
		super();
	}

	public Depo(List<Train> trains) {
		super();
		this.trains = trains;
	}

	public void addTrains(List<Train> trains) {
		this.trains.addAll(trains);
	}
	
	public void addTrain(Train train) {
		trains.add(train);
	}	
	
	public Train getOneTrain(int number) {
		return trains.get(number);
	}

	public List<Train> getAllTrains() {
		return trains;
	}

	public void removeOneTrain(Train train) {
		trains.remove(train);
	}

	public void removeAllTrains() {
		trains.clear();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trains == null) ? 0 : trains.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Depo other = (Depo) obj;
		if (trains == null) {
			if (other.trains != null)
				return false;
		} else if (!trains.equals(other.trains))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Depo [trains=" + trains + "]";
	}	

}
