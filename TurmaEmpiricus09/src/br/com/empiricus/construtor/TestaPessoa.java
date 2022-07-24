package br.com.empiricus.construtor;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.next();
		int idade = entrada.nextInt();
		
		//Classe  --> objeto --> new Construtor ...
		Pessoa p1 = new Pessoa(nome, idade);
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);

	}

}
