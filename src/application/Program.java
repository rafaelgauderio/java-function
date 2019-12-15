package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

import Utilities.UpperCaseName;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		list.add(new Product("Car", 50000.00));
		list.add(new Product("Bike", 5000.00));
		list.add(new Product("Tablet", 2000.00));
		list.add(new Product("Fan", 300.00));
		list.add(new Product("Keybord", 40.00));

		List<String> namesUper = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		namesUper.forEach(System.out::println);

		System.out.println();
		System.out.println("Method reference static");
		List<String> namesUpper = list.stream().map(Product::staticUpperCase).collect(Collectors.toList());
		namesUpper.forEach(System.out::println);

		System.out.println();
		System.out.println("Method reference non static");
		List<String> namesUpper2 = list.stream().map(Product::nosStaticUpperCase).collect(Collectors.toList());
		namesUpper2.forEach(System.out::println);

		System.out.println();
		System.out.println("Declared lambda expression");
		Function<Product, String> func = pro -> pro.getName().toUpperCase();
		List<String> namesLambda = list.stream().map(func).collect(Collectors.toList());
		namesLambda.forEach(System.out::println);

		System.out.println();
		System.out.println("Inline lambda expresion");
		List<String> namesLambdain = list.stream().map(pro -> pro.getName().toUpperCase()).collect(Collectors.toList());
		namesLambdain.forEach(System.out::println);

		sc.close();

	}

}
