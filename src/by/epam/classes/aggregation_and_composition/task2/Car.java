/*
 * 2. 
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
package by.epam.classes.aggregation_and_composition.task2;

import java.io.Serializable;

public class Car implements Serializable {

	private static final long serialVersionUID = 1L;
	private String brand;
	private double consumption;
	private double fuelLevel;
	private Engine engine;
	private Wheel wheel;

	public Car() {
		super();
		this.brand = "Mersedes";
		this.consumption = 9.1;
		this.fuelLevel = 40;
		engine = new Engine(606, 75);
		wheel = new Wheel(15, WheelType.Summer);
	}

	public Car(String brand, double consumption, double fuelLevel, int engineNumber, int power, int diameter,
			WheelType wheelType) {
		super();
		this.brand = brand;
		this.consumption = consumption;
		this.fuelLevel = fuelLevel;
		engine = new Engine(engineNumber, power);
		wheel = new Wheel(diameter, wheelType);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getConsumption() {
		return consumption;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	public double getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	
	public void addFuel(double fuel) {
		fuelLevel += fuel;
	}

	public double move() {
		double distance;
		distance = fuelLevel / consumption * 100;
		fuelLevel = 0;
		return distance;
	}

	public void setWheelDiameter(int diameter) {
		wheel.setDiameter(diameter);
	}
	
	public int getWheelDiameter() {
		return wheel.getDiameter();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		long temp;
		temp = Double.doubleToLongBits(consumption);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		temp = Double.doubleToLongBits(fuelLevel);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
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
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(consumption) != Double.doubleToLongBits(other.consumption))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (Double.doubleToLongBits(fuelLevel) != Double.doubleToLongBits(other.fuelLevel))
			return false;
		if (wheel == null) {
			if (other.wheel != null)
				return false;
		} else if (!wheel.equals(other.wheel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [brand=" + brand + ", consumption=" + consumption + ", fuelLevel="
				+ fuelLevel + ", engine=" + engine + ", wheel=" + wheel + "]";
	}

}