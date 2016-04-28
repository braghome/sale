package com.trulia.functional.sale;

public class Car {
	private final String brand;
	private final String model;
	private final int year;
	private final double originalValue;
	
	public Car(String brand, String model, int year, double originalValue) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.originalValue = originalValue;
	}

	public String getBrand() {
		return brand;
	}
	

	public String getModel() {
		return model;
	}
	

	public int getYear() {
		return year;
	}
	

	public double getOriginalValue() {
		return originalValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(originalValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + year;
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
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Double.doubleToLongBits(originalValue) != Double.doubleToLongBits(other.originalValue))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", originalValue=" + originalValue + "]";
	}
	
}
