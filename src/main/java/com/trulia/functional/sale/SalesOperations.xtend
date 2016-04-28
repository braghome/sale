package com.trulia.functional.sale

import java.util.ArrayList
import java.util.List

class SalesOperations {
	def String printBrands(List<Car> cars) {
		return cars.map[brand].join(", ")
	}

	def List<Sale> collectBrands(String brandfilt, List<Sale> sales) {
		val salesOfAPrius = new ArrayList<Sale>()
		salesOfAPrius.addAll(
			sales.filter[car.brand == brandfilt].toList);
		return salesOfAPrius
	}
	
	def List<Sale> youngestPerson(List<Person> persons, List<Sale> sales) {
		val youngest = persons.reduce[p1, p2| if (p1.age < p2.age) p2 else p1] 
							?: new Person("the one", "one only", 1, true)
		val buys = new ArrayList<Sale>()
		buys.addAll(sales.filter[youngest == buyer].toList)
		// or we could add: buys.add(sales.findFirst[youngest == buyer])
		return buys;
	}
}
