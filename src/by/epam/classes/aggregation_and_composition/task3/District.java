package by.epam.classes.aggregation_and_composition.task3;

import java.io.Serializable;
import java.util.*;

public class District implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private City capital;
	private Set<City> cities = new HashSet<City>();
	
	public District() {
		super();
	}
	
	public District(String name, City capital) {
		super();
		this.name = name;
		this.capital = capital;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public void addCity(City city) {
		cities.add(city);
	}
	
	public void removeCity(City city) {
		cities.remove(city);
	}

	public Set<City> getCities() {
		return cities;
	}

	public void addCities(Set<City> cities) {
		cities.addAll(cities);
	}
	
	public void removeCities() {
		cities.clear();
		capital = null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		District other = (District) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [name=" + name + ", capital=" + capital + "]";
	}
	
}