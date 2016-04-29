package com.trulia.functional.sale;

import java.util.List;
import java.util.stream.Collectors;

public class SalesOperations {
	public String printBrands(final List<Car> cars) {
		return cars.stream().map(x -> x.getBrand())
			     .collect(Collectors.joining(", "));
	}
	
	public List<Sale> collectBrands(final String brand, final List<Sale> sales) {
		return sales
				.stream()
				.filter(x -> x.getCar().getBrand().equals(brand))
				.collect(Collectors.toList());
	}
	
	public List<Sale> youngestPerson(final List<Person> persons, final List<Sale> sales) {
		Person youngest = persons.stream()
								 .reduce((x, y) -> 
								 			x.getAge() < y.getAge() ? x : y)
					 			 .orElse(new Person("the one", "one only", 1, true));
		return sales.stream()
		 		 .filter(x -> x.equals(youngest))
		 		 .collect(Collectors.toList());
	}
}
