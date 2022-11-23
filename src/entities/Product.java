package entities;

public class Product {
	private String name;
	private Double price;

	public Product(String name, Double price) {

		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	public static String staticUpperCase (Product pro) {
		return pro.getName().toUpperCase();
	}
	public String nonStaticUpperCase() {
		return name.toUpperCase();
	}
	
	public static String staticIncrease15Percent(Product pro) {
		return String.format("r$ %.2f", pro.getPrice()*1.15);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + String.format("U$%.2f", price) + "]";
	}

}
