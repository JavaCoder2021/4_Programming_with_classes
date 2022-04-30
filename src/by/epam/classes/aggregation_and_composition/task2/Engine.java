package by.epam.classes.aggregation_and_composition.task2;

import java.io.Serializable;

public class Engine implements Serializable {
	
	private static final long serialVersionUID = 1L;
    	private int number;
    	private int power;
    
	public Engine() {
		super();
		number = 616;
		power = 75;
	}	
    
	public Engine(int number, int power) {
		super();
		this.number = number;
		this.power = power;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + power;
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
		Engine other = (Engine) obj;
		if (number != other.number)
			return false;
		if (power != other.power)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [number=" + number + ", power=" + power + "]";
	}	

}
