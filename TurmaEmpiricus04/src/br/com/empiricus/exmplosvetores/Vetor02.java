package br.com.empiricus.exmplosvetores;

import java.util.Scanner;

public class Vetor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("Tamanho do Vetor: ");
		int tamanhoVetor = entrada.nextInt();
		
		double [] notas = new double [tamanhoVetor];
		double soma = 0.0, media = 0.0;
		
		System.out.println("Digite as notas do Aluno:");
		for(int i =0; i < notas.length; i++) {
			System.out.print(i+1 + "nota: ");
			notas [i] = entrada.nextDouble();
			soma += notas[i];
			media = soma /  notas.length;
		}
		
		System.out.println("Soma das notas do Aluno: " + soma);
		System.out.printf("Media das notas do Aluno: %.2f", media);
	}

}
