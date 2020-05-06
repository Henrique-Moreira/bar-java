package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char sexo;
		int cervejas, refri, espetos;
		double consumo, cover, ingresso, total;

		System.out.print("Sexo: ");
		sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		cervejas = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		refri = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		espetos = sc.nextInt();

		if (sexo == 'F') {
			ingresso = 8.0;
		} else {
			ingresso = 10.0;
		}

		consumo = cervejas * 5.0 + refri * 3.0 + espetos * 7.0;

		if (consumo > 30) {
			cover = 0.0;
		}
		else {
			cover = 4.0;
		}
		
		total = ingresso + consumo + cover;
		
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n", consumo);
		if (cover == 0.0) {
			System.out.println("Isento de Cover");
		}
		else {
			System.out.printf("Cover = R$ %.2f%n", cover);
		}
		System.out.printf("Ingresso = R$ %.2f%n", ingresso);
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n", total);
		
		
		
		
		
		
		
			sc.close();
	}

}
