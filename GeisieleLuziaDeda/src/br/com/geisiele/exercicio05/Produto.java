package br.com.geisiele.exercicio05;

public class Produto {
	
	private String nome;
	
	public Produto(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Produto: " + this.nome;
	}
}
