package br.com.empiricus.metodos;

import java.util.Scanner;

public class TestaMetodo {
	
	static int numero3, numero4, multiplicacao, divisao; //variaveis globais

	public static void main(String[] args) {
		// --> metodos ... funcções, subrotinas, procedimentos....
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número5: ");
		int x= entrada.nextInt();
		
		System.out.println("Digite o número6: ");
		int y= entrada.nextInt();
		
		metodo01(); // chamada de método
		metodo02();
		metodo03();
		metodo04();
		metodo05();
		metodo06(x,y); //Argumentos
		
		System.out.println(MetodoFora.metodo07(x, y));
		System.out.println(MetodoFora.metodo07(0, 20));
	}
	//verbos --> ações --> ex: salvar, carregar, calcular etc.........
	public static void metodo01() {
		System.out.println("Olá eu sou o método 01.....");
	}
	
	public static void metodo02() {
		int numero1 = 10, numero2 = 20, soma;
		soma = numero1 + numero2;
		System.out.println("Soma metodo02: " + soma);
	}
	
	public static void metodo03() {
		int numero1 = 100, numero2 = 50, subtracao; // variaveis locais
		subtracao = numero1 - numero2;
		System.out.println("Subtracao metodo03: " + subtracao);
	}
	
	public static void metodo04() {
		numero3 = 8;
		numero4 = 5;
		multiplicacao = numero3 * numero4;
		numero3 = 5;
		System.out.println("metodo04 variavel atualizada: " + numero3);
		
	}
	
	public static void metodo05() {
		System.out.println("Multiplicacao metodo 05 recebendo o valor do metodo04: " + multiplicacao);
	}
	
	public static void metodo06 (int numero5, int numero6) {//  --> parametros
		divisao = numero5 / numero6;
		multiplicacao = numero5 * numero6;
		System.out.println("divisao: " + divisao);
		System.out.println("Multiplicacao: " + multiplicacao);
	}

}
