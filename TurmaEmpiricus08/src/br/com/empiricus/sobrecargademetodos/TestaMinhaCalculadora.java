package br.com.empiricus.sobrecargademetodos;

public class TestaMinhaCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		
		System.out.println(calc.soma(10, 20));
		System.out.println(calc.soma(10.01, 20));
		System.out.println(calc.soma(10, 20, 2));

	}

}
