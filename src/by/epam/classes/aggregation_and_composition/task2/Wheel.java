package by.epam.classes.aggregation_and_composition.task2;

import java.io.Serializable;

public class Wheel implements Serializable {

	private static final long serialVersionUID = 1L;
	private int diameter;
	private WheelType wheelType;

	public Wheel() {
		super();
		diameter = 15;
		this.wheelType = wheelType.Summer;
	}

	public Wheel(int diameter, WheelType wheelType) {
		super();
		this.diameter = diameter;
		this.wheelType = wheelType;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public WheelType getWheelType() {
		return wheelType;
	}

	public void setWheelType(WheelType wheelType) {
		this.wheelType = wheelType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diameter;
		result = prime * result + ((wheelType == null) ? 0 : wheelType.hashCode());
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
		Wheel other = (Wheel) obj;
		if (diameter != other.diameter)
			return false;
		if (wheelType != other.wheelType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [diameter=" + diameter + ", wheelType=" + wheelType + "]";
	}

}