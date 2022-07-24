package br.com.geisiele.exercicio01;

import java.util.Scanner;

//Geisiele Luzia Deda

public class CustoCarro {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double percDistrib = 0.28;
		double percImpostos = 0.45;
		
		System.out.println("Informe o custo de fábrica do carro: ");
		int custoFabrica = entrada.nextInt();
		int custoConsumidor = custoFabrica;
		custoConsumidor += (custoFabrica*percDistrib);
		custoConsumidor += (custoFabrica*percImpostos);
		
		System.out.println("O custo ao consumidor de um carro novo é: "  + custoConsumidor);
		entrada.close();
	}

}
