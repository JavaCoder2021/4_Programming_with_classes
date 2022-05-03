package by.epam.classes.aggregation_and_composition.task5;

import java.io.Serializable;

public class Tour implements Serializable {

	private static final long serialVersionUID = 1L;
    	private TourType type;
    	private TourTransport transport;
    	private boolean food;
    	private int numberOfDays;
    	private int cost;
    
	public Tour() {
		super();
	}    
    
	public Tour(TourType type, TourTransport transport, boolean food, int numberOfDays, int cost) {
		super();
		this.type = type;
		this.transport = transport;
		this.food = food;
		this.numberOfDays = numberOfDays;
		this.cost = cost;
	}

	public TourType getType() {
		return type;
	}

	public void setType(TourType type) {
		this.type = type;
	}

	public TourTransport getTransport() {
		return transport;
	}

	public void setTransport(TourTransport transport) {
		this.transport = transport;
	}

	public boolean isFood() {
		return food;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cost;
		result = prime * result + (food ? 1231 : 1237);
		result = prime * result + numberOfDays;
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Tour other = (Tour) obj;
		if (cost != other.cost)
			return false;
		if (food != other.food)
			return false;
		if (numberOfDays != other.numberOfDays)
			return false;
		if (transport != other.transport)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [type=" + type + ", transport=" + transport + ", food=" + food + ", numberOfDays=" + numberOfDays
				+ ", cost=" + cost + "]";
	}

}
