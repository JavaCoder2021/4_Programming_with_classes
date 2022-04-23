package by.epam.classes.the_simplest_classes_and_objects.task10;

import java.util.*;

public class Airlines {
	
	private List<Airline> airlines;
	
	{
		airlines = new LinkedList<Airline>();
	}

	public Airlines() {
		super();
	}

	public Airlines(List<Airline> airlines) {
		super();
		this.airlines = airlines;
	}

	public void addAirline(Airline airline) {
		airlines.add(airline);
	}

	public void addAirlines(List<Airline> airlines) {
		airlines.addAll(airlines);
	}

	public Airline getAirline(int number) {
		return airlines.get(number);
	}

	public List<Airline> getAirlines() {
		return airlines;
	}

	public void removeAirline(Airline airline) {
		airlines.remove(airline);
	}

	public void removeAirlines() {
		airlines.clear();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlines == null) ? 0 : airlines.hashCode());
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
		Airlines other = (Airlines) obj;
		if (airlines == null) {
			if (other.airlines != null)
				return false;
		} else if (!airlines.equals(other.airlines))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [airlines=" + airlines + "]";
	}

}
