package br.com.empiricus.exmplosvetores;

import java.util.Scanner;

public class Vetor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] pontuacao = new double [5];
		
		double maior = pontuacao [0];
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a pontuacao da Atividade: ");
		for(int i =0; i < pontuacao.length; i++) {
			System.out.print(i + 1 + "pontuacao: ");
			pontuacao [i] = entrada.nextDouble();
			maior = pontuacao[i];
			
			if (pontuacao[i]>maior) {
				maior = pontuacao[i];
				
				System.out.println("A maior nota da atividade é: " + maior);
				
			}
		
		}	
	}
	
}
