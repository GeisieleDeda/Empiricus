package br.com.exercicio.atividade;

public class atividade {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Aviao av1 = new Aviao();
		
		av1.setModelo("Boing");
		av1.ano= 2019;
		
		System.out.println("Aviao: " + av1.getModelo());
		System.out.println(av1.ano);
	}

}
