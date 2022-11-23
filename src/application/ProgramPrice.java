package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import Utilities.PriceUpdate;
import entities.Product;

public class ProgramPrice {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		list.add(new Product("T-shirt", 50.00));
		list.add(new Product("snearkers", 500.00));
		list.add(new Product("racket", 80.00));
		list.add(new Product("underwear", 25.00));
		list.add(new Product("panty", 95.00));
		
		System.out.println("Função map\n"
				+ "\tFunção map é uma função que aplica uma função a todos os elementos de uma stream.\n"
				+ "\tFunção map é diferente da estrutura de dados Map.\n"
				+ "\tA função map só funciona com stream.\n"
				+ "Stream é uma sequência de dados.\n"
				+ "\tAssim sendo temos que converter a lista instanciada para stream para aplica a função map.\n"
				+ "\te depois converter de stream para lista.\n"
				+ "Conversões\n"
				+ "\tList para stream = .stream()\n"
				+ "\tSteam para List = .collect(Collectors.toList())\n");	
		
		System.out.println("\nImplementação da Interface (aumentar 15%)");
		List<String> pricePlus20Percent = list.stream().map(new PriceUpdate()).collect(Collectors.toList());		
		pricePlus20Percent.forEach(System.out::println);
		
		System.out.println("\nReferece method com método estático");
		List<String> pricePlus20Percent2 = list.stream().map(Product::staticIncrease15Percent).collect(Collectors.toList());
		pricePlus20Percent2.forEach(System.out::println);
		
		System.out.println("\nReference method com método não estárico");
		List <String> pricePlus20Percent3 = list.stream().map(Product::nonStaticIncrease15Percent).collect(Collectors.toList());
		pricePlus20Percent3.forEach(System.out::println);
		
		
		sc.close();

	}

}
