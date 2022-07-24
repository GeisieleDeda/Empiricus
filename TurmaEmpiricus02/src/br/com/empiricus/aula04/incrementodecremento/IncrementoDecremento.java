package br.com.empiricus.aula04.incrementodecremento;

public class IncrementoDecremento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pós-incremento --> variavel++ = (variavel +1)
		//Pré-incremento --> ++variavel = (1 + variavel)
		int a = 1;
		
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(++a);
		System.out.println(a);
		
		System.out.println(a--);
		System.out.println(a);

	}

}
