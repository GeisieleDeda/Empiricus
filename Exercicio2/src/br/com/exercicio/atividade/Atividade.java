package br.com.exercicio.atividade;

public class Atividade {

	public static void main(String[] args) throws InterruptedException {
		Aviao av1 = new Aviao("Boing", 2022, 800);
		
		System.out.println("Aviao: " + av1.getModelo());
		System.out.println(av1.ano);
		
		av1.decolar(10);
	}

}
