package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Bill;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("DESAFIO: Bar OO ");

		System.out.println("Digite sexo (F ou M): ");
		Bill.gender = sc.next().charAt(0);
		System.out.println("Digite a quantidade de cervejas: ");
		Bill.beer = sc.nextInt();
		System.out.println("Digite a quantidade de refrigerantes: ");
		Bill.softDrink = sc.nextInt();
		System.out.println("Digite a quantidade de espetinhos: ");
		Bill.barbecue = sc.nextInt();

		System.out.println("RELATÓRIO: ");
		System.out.printf("Consumo = R$ %.2f%n", Bill.feeding());
		System.out.printf("Couvert = R$ %.2f%n", Bill.cover());
		System.out.printf("Ingresso = R$ %.2f%n", Bill.ticket(Bill.gender));

		System.out.printf("\nTotal = R$ %.2f%n", Bill.total());

		sc.close();



	}

}
