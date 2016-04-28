package com.trulia.functional.sale;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SalesOperations {
	public String printBrands(final List<Car> cars) {
		return cars.stream().map(x -> x.getBrand())
			     .collect(Collectors.joining(", "));
	}
	
	public List<Sale> collectBrands(final String brand, final List<Sale> sales) {
		List<Sale> salesOfAPrius = new ArrayList<Sale>();
		salesOfAPrius.addAll(sales.stream().filter(x -> x.getCar().getBrand().equals(brand))
				  .collect(Collectors.toList()));	
		return salesOfAPrius;
	}
}
