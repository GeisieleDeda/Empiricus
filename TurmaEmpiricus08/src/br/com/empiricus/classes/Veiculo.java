package br.com.empiricus.classes;

public class Veiculo {
	
	public String getMarca() {
	return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	//Atributos...
	private String modelo;
	private String marca;
	private int ano;
	private int velocidade = 0;
	
	//método -->serviço --> acessar para modificaçãoo atributo
	public void setModelo(String modelo) {
		this.modelo = modelo;
	
	}
	//método --> serviço --> recuperação dos dados que foram modificados...
	public String getModelo() {
		return modelo;
	}
	//Método...
	void acelerar(int aceleracao) throws InterruptedException {
		//velocidade += aceleracao;
		for(int i = 0; i< aceleracao; i++) {
			velocidade++;
			System.out.println(i);
			Thread.sleep(500);
			
		}
		
	}
	
	void freiar(int reduzir) throws InterruptedException {
		for(int i = 0; i> reduzir; i--) {
			velocidade--;
			System.out.println(i);
			Thread.sleep(500);
		
		}
	}
}
