package br.com.empiricus.exmplosvetores;

import java.util.Scanner;

public class Vetor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantidade de jogadas: ");
		
		int entrada = sc.nextInt();
		
		
		int [] numerosDado = new int[entrada];
		
		int valor = 0;
		int media = 0;
		int soma = 0;
		int maior = 0;
		
		for(int i =0; i < numerosDado.length; i++) {
			System.out.printf("Digite o número que saiu no dado: ");
			valor = sc.nextInt();
			soma += valor;
			if (valor>maior) {
				maior = valor;
			}
		}
		media = soma/entrada;
		System.out.printf("A Media é: " + media);
	}

}
