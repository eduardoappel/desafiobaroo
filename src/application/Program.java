package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("DESAFIO: Bar OO ");

		System.out.println("Digite sexo (F ou M): ");
		char sexo = sc.next().charAt(0);
		System.out.println("Digite a quantidade de cervejas: ");
		int cervejas = sc.nextInt();
		System.out.println("Digite a quantidade de refrigerantes: ");
		int refrigerantes = sc.nextInt();
		System.out.println("Digite a quantidade de espetinhos: ");
		int espetinhos = sc.nextInt();
		 

		sc.close();



	}

}
