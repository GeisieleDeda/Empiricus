package br.com.empiricus.exmplosvetores;

public class Vetor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayVetor = new int[10];
		
		arrayVetor[5] = 250;
		
		int x = 632;
		
		arrayVetor[7] = x;
		
		arrayVetor [2] = 1000;
		
		int y = arrayVetor [2];
		
		for(int i = 0; i < arrayVetor.length; i++) {
			System.out.println(i + " - " + arrayVetor[i]);
		}
	System.out.println("Variavel y: " + y);
	}
	

}
