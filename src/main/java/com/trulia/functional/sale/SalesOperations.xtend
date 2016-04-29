package com.trulia.functional.sale

import java.util.List

class SalesOperations {
	def String printBrands(List<Car> cars) {
		return cars.map[brand].join(", ")
	}

	def List<Sale> collectBrands(String brandfilt, List<Sale> sales) {
		sales.filter[car.brand == brandfilt].toList
	}
	
	def List<Sale> youngestPerson(List<Person> persons, List<Sale> sales) {
		val youngest = persons.reduce[p1, p2| if (p1.age < p2.age) p1 else p2] 
							?: new Person("the one", "one only", 1, true)
		sales.filter[youngest == buyer].toList
	}
}
