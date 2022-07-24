package br.com.exercicio.atividade;

public class Aviao {

		public String getModelo() throws InterruptedException {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

		private String modelo;
		int ano;
		int velocidade = 0;
		
		void decolar(int aceleracao) throws InterruptedException {
			
			for(int i = 0; i< aceleracao; i++) {
				velocidade++;
				System.out.println(i);
				Thread.sleep(500);
				
			System.out.println("Aviao decolando...");
		}
	}

