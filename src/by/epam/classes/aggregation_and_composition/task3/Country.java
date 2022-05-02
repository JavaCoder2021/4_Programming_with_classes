package by.epam.classes.aggregation_and_composition.task3;

import java.io.Serializable;
import java.util.*;

public class Country implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private City capital;
	private Set<Region> regions = new HashSet<Region>();
	
	public Country() {
		super();
	}
	
	public Country(String name, City capital) {
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
	
	public void addRegion(Region region) {
		regions.add(region);
	}
	
	public void removeRegion(Region region) {
		regions.remove(region);
	}
	
	public Set<Region> getRegions() {
		return regions;
	}
	
	public void addRegions(Set<Region> regions) {
		regions.addAll(regions);
	}
	
	public void removeRegions() {
		regions.clear();
		capital = null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
		Country other = (Country) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [name=" + name + ", capital=" + capital + "]";
	}
	
}