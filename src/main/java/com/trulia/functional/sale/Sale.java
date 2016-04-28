package com.trulia.functional.sale;

public class Sale {
	private final Person buyer;
	private final Person seller;
	private final Car car;
	private final double cost;
	
	public Sale(Person buyer, Person seller, Car car, double cost) {
		this.buyer = buyer;
		this.seller = seller;
		this.car = car;
		this.cost = cost;
	}

	public Person getBuyer() {
		return buyer;
	}
	
	public Person getSeller() {
		return seller;
	}
	
	public Car getCar() {
		return car;
	}

	public double getCost() {
		return cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buyer == null) ? 0 : buyer.hashCode());
		result = prime * result + ((car == null) ? 0 : car.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((seller == null) ? 0 : seller.hashCode());
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
		Sale other = (Sale) obj;
		if (buyer == null) {
			if (other.buyer != null)
				return false;
		} else if (!buyer.equals(other.buyer))
			return false;
		if (car == null) {
			if (other.car != null)
				return false;
		} else if (!car.equals(other.car))
			return false;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (seller == null) {
			if (other.seller != null)
				return false;
		} else if (!seller.equals(other.seller))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sale [buyer=" + buyer + ", seller=" + seller + ", car=" + car + ", cost=" + cost + "]";
	}
	
}
