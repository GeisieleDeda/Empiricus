package br.com.exercicio.atividade;

public class Aviao {
	
	Aviao() {}
	
	public Aviao(String modelo, int ano, int velocidade) {
		super();
		this.modelo = modelo;
		this.ano = ano;
		this.velocidade = velocidade;
	}

	private String modelo;
	int ano;
	int velocidade = 0;

	public String getModelo() throws InterruptedException {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void decolar(int aceleracao) throws InterruptedException {
		
		for(int i = 0; i< aceleracao; i++) {
			velocidade++;
			System.out.println(i);
			Thread.sleep(500);
				
			System.out.println("Aviao decolando...");
		}
	}
}
