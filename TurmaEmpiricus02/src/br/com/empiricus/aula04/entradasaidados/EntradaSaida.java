package br.com.empiricus.aula04.entradasaidados;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		int a, b, soma;
		
		System.out.println("Digite o valor de A: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = entrada.nextInt();
		
		soma = a + b;
		
		System.out.println("Asoma de A+B: " + soma);
		
		entrada.close();
	}

}
