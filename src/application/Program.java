package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import Utilities.UpperCaseName;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		list.add(new Product("Car",50000.00));
		list.add(new Product("Bike",5000.00));
		list.add(new Product("Tablet",2000.00));
		list.add(new Product("Fan",300.00));
		list.add(new Product("Keybord",40.00));
		
		List<String> namesUper = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		namesUper.forEach(System.out::println);
		
		sc.close();

	}

}
