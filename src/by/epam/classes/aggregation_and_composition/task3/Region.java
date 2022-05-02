package by.epam.classes.aggregation_and_composition.task3;

import java.io.Serializable;
import java.util.*;

public class Region implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int square;
	private City capital;
	private Set<District> districts = new HashSet<District>();

	public Region() {
		super();
	}	
	
	public Region(String name, int square, City capital) {
		super();
		this.name = name;
		this.square = square;
		this.capital = capital;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public void addDistrict(District district) {
		districts.add(district);
	}
	
	public void removeDistrict(District district) {
		districts.remove(district);
	}

	public Set<District> getDistricts() {
		return districts;
	}

	public void addDistricts(Set<District> districts) {
		districts.addAll(districts);
	}
	
	public void removeDistricts() {
		districts.clear();
		capital = null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + square;
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
		Region other = (Region) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (square != other.square)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name + " : " + capital;
	}
	
}