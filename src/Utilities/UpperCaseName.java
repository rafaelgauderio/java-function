package Utilities;

import java.util.function.Function;

import entities.Product;

public class UpperCaseName implements Function<Product,String>{

	@Override
	public String apply(Product pro) {
		
		return pro.getName().toUpperCase();
	}
	

}
