package com.trulia.functional.sale

import org.eclipse.xtend.lib.annotations.Data

@Data
class Sale {
	Person buyer
	Person seller
	Car car
	double cost }
