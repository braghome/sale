package com.trulia.functional.sale;

import java.util.ArrayList;
import java.util.List;

public class SalesOperations {
	public String printBrands(final List<Car> cars) {
		StringBuilder s = new StringBuilder();
		for (Car car : cars) {
			s.append(car.getBrand()).append(", ");
		}
		return s.toString().substring(0, s.length() - 2);
	}
	
	public List<Sale> collectBrands(final String brand, final List<Sale> sales) {
		List<Sale> salesOfAPrius = new ArrayList<Sale>();
		for (Sale sale : sales) {
			if (sale.getCar().getBrand().equals(brand)) {
				salesOfAPrius.add(sale);
			}
		}
		return salesOfAPrius;
	}

	public List<Sale> youngestPerson(final List<Person> persons, final List<Sale> sales) {
		Person youngest = null;
		for (Person person : persons) {
			if (null == youngest || youngest.getAge() < youngest.getAge()) {
				youngest = person;
			}
		}
		List<Sale> buys = new ArrayList<Sale>();
		for (Sale sale : sales) {
			if (sale.getBuyer().equals(youngest)) {
				buys.add(sale);
			}
		}
		return buys;
	}
}
