package br.com.empiricus.exemploswhile;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDados = new Scanner(System.in);
		
		int numero = 0;
		
		while(numero != 10) {
			
			System.out.println("Digite um número: ");
			numero = entradaDados.nextInt();
			
			if(numero >= 18 && numero < 70) {
				System.out.println("Pode votar!");
			}
			else if(numero >= 16 ) {
				System.out.println("Opção...");
			}
			else {
				System.out.println("Não pode votar");
			}
				
		}
	}

}
