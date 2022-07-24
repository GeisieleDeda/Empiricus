package br.com.empiricus.matrizes;

public class Matriz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double [][] notasAlunos = new double[2][4]; 
		
		notasAlunos[0][0] = 9.9;
		notasAlunos[0][1] = 8.8;
		notasAlunos[0][2] = 9.9;
		notasAlunos[0][3] = 8.8;
		
		notasAlunos[1][0] = 7.8;
		notasAlunos[1][1] = 3.8;
		notasAlunos[1][2] = 4.9;
		notasAlunos[1][3] = 2.8;
		
		for(int l = 0; l < notasAlunos.length; l++) {
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.print(notasAlunos[l][c] + " | ");
			}
			System.out.println();
		}
	}
	

}
