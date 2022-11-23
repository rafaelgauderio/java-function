package Utilities;

import java.util.function.Function;

import entities.Product;

public class PriceUpdate implements Function <Product, String> {

	@Override
	public String apply(Product prod) {
		
		//increase fifteen percent
		return String.format("r$ %.2f", prod.getPrice()*1.15);
	}

}
