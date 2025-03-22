package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Bill;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bill bill = new Bill();

		System.out.println("DESAFIO: Bar OO ");

		System.out.println("Digite sexo (F ou M): ");
		bill.gender = sc.next().charAt(0);
		System.out.println("Digite a quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		System.out.println("Digite a quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.println("Digite a quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();

		System.out.println("RELATÓRIO: ");
		System.out.printf("Consumo = R$ %.2f%n", bill.feeding());
		System.out.printf("Couvert = R$ %.2f%n", bill.cover());


		sc.close();



	}

}
