package br.com.empiricus.matrizes;

import java.util.Scanner;

public class Matriz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

double [][] notasAlunos = new double[2][4]; 
		Scanner entrada = new Scanner(System.in);
		
		
		for(int l = 0; l < notasAlunos.length; l++) {
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.printf("Digite às notas: [%d] [%d]:", l,c);
				notasAlunos[l][c] = entrada.nextDouble();
			}				
			System.out.println();
		}
		for(int l = 0; l < notasAlunos.length; l++) {
			
		
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.print(notasAlunos[l][c] + " | ");
			}
			System.out.println();	
		}
	
	}
}