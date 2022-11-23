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
		
		System.out.println("Fun��o map\n"
				+ "\tFun��o map � uma fun��o que aplica uma fun��o a todos os elementos de uma stream.\n"
				+ "\tFun��o map � diferente da estrutura de dados Map.\n"
				+ "\tA fun��o map s� funciona com stream.\n"
				+ "Stream � uma sequ�ncia de dados.\n"
				+ "\tAssim sendo temos que converter a lista instanciada para stream para aplica a fun��o map.\n"
				+ "\te depois converter de stream para lista.\n"
				+ "Convers�es\n"
				+ "\tList para stream = .stream()\n"
				+ "\tSteam para List = .collect(Collectors.toList())\n");	
		
		System.out.println("\nImplementa��o da Interface (aumentar 15%)");
		List<String> pricePlus20Percent = list.stream().map(new PriceUpdate()).collect(Collectors.toList());		
		pricePlus20Percent.forEach(System.out::println);
		
		System.out.println("\nReferece method com m�todo est�tico");
		List<String> pricePlus20Percent2 = list.stream().map(Product::staticIncrease15Percent).collect(Collectors.toList());
		pricePlus20Percent2.forEach(System.out::println);
		
		System.out.println("\nReference method com m�todo n�o est�rico");
		List <String> pricePlus20Percent3 = list.stream().map(Product::nonStaticIncrease15Percent).collect(Collectors.toList());
		pricePlus20Percent3.forEach(System.out::println);
		
		
		sc.close();

	}

}
