package com.trulia.functional.sale

import java.util.List

class SalesOperations {
	def printBrands(List<Car> cars) {
		cars.map[brand].join(", ")
	}

	def collectBrands(String brandfilt, List<Sale> sales) {
		sales.filter[car.brand == brandfilt].toList
	}
	
	def youngestPerson(List<Person> persons, List<Sale> sales) {
		sales.filter[persons.reduce[p1, p2| if (p1.age < p2.age) p1 else p2] 
							?: new Person("the one", "one only", 1, true) == buyer].toList
	}
}
