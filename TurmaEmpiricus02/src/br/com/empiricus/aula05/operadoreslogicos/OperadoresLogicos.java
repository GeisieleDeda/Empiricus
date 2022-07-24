package br.com.empiricus.aula05.operadoreslogicos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//e --> &&
		//ou --> ||
		//ou exclusivo --> ^
		//Not --> !
		
		/*int idade = 20;
		boolean precisaVotar = idade >= 18 && idade < 70;
		System.out.println("precisavotar");*/
		
		/*int nrAmarelo = 2, nrVermelho = 1;
		boolean suspenso = nrAmarelo == 2 || nrVermelho == 1; 
		System.out.println("suspenso");*/
		
		/*int x = 9, y = 11;
		boolean teste = x > 10 ^ y > 10;
		System.out.println(teste);*/
		
		int idade = 20; 
		boolean maiorIdade = !(idade >= 18);
		System.out.println(maiorIdade);
		
		

	}

}
