package br.com.geisiele.exercicio02;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int base = 0;
		do {
			System.out.println("Informe a base do Triangulo: ");
			base = entrada.nextInt();
		} while (base <= 0);
		
		int altura = 0;
		do {
			System.out.println("Informe a altura do Triangulo: ");
			altura = entrada.nextInt();
		} while (altura <= 0);
		
		System.out.println((base * altura) / 2);
		
		entrada.close();
	}

}
