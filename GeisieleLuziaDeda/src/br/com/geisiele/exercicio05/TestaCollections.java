package br.com.geisiele.exercicio05;

import java.util.ArrayList;

public class TestaCollections {

	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<>();
		
		Produto tenis = new Produto("Tênis");
		Produto calca = new Produto("Calça");
		Produto blusa = new Produto("Blusa");
		Produto meia = new Produto("Meia");
		
		produtos.add(tenis);
		produtos.add(calca);
		produtos.add(blusa);
		produtos.add(meia);
		for(Produto prod : produtos) {
			System.out.println(prod.toString());
		}
		System.out.println(); // Pular Linha
		
		produtos.remove(2);
		for(Produto prod : produtos) {
			System.out.println(prod.toString());
		}
		System.out.println(); // Pular Linha
		
		System.out.println("Quantidade de diferentes produtos é:" + produtos.size());
	}

}
