package by.epam.classes.aggregation_and_composition.task5;

import java.io.Serializable;
import java.util.*;

public class TourAgency implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Tour> tours = new ArrayList<Tour>();

	public TourAgency() {
		super();
	}

	public TourAgency(List<Tour> tours) {
		super();
		this.tours = tours;
	}

	public void addTour(Tour tour) {
		tours.add(tour);
	}

	public void removeTour(Tour tour) {
		tours.remove(tour);
	}

	public List<Tour> getTours() {
		return tours;
	}

	public void addTours(List<Tour> tours) {
		this.tours.addAll(tours);
	}

	public void removeTours() {
		this.tours.clear();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tours == null) ? 0 : tours.hashCode());
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
		TourAgency other = (TourAgency) obj;
		if (tours == null) {
			if (other.tours != null)
				return false;
		} else if (!tours.equals(other.tours))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [tours=" + tours + "]";
	}

}