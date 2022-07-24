package br.com.geisiele.exercicio03;

import java.util.Scanner;

public class NumeroZero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int soma = 0;
		int num = 0;
		do {
			System.out.println("Informe um número maior que zero para somar ou 0 para finalizar a soma: ");
			num = entrada.nextInt();
			soma += num;
		} while (num != 0);
		
		System.out.println("A soma total é: " + soma);
		entrada.close();
	}

}
