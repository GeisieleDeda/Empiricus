package br.com.empiricus.exemplosdowhile;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int i = 0;
		
		do {
			
			System.out.println("Entre com o número 1: ");
			int numero1 = entrada.nextInt();
			
			System.out.println("Entre com o número 2: ");
			int numero2 = entrada.nextInt();
			
			if(numero2 == 0 ) {
				System.out.println("não podemos dividir por zero...");
				break; // ---> funciona como um ponto de parada do loop...
			}
			
			System.out.println((i+1) + "resultado: " + numero1 + "/" + numero2 + "é: " + (numero1/numero2));
			i++;
			
		}while (i < 2);
		
		System.out.println("Fim do programa... ");
	}

}
