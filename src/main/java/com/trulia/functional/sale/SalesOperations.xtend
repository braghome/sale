package com.trulia.functional.sale

import java.util.ArrayList
import java.util.List

class SalesOperations {
	def String printBrands(List<Car> cars) {
		return cars.map[brand].toList.toString
	}

	def List<Sale> collectBrands(String brandfilt, List<Sale> sales) {
		var salesOfAPrius = new ArrayList<Sale>()
		salesOfAPrius.addAll(
			sales.filter[car.brand == brandfilt].toList);
		return salesOfAPrius
	}
}
