package br.com.empiricus.aula03.operadoresaritimeticos;

public class OperadorAritmetico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//soma -> +
		//subtração -> -
		//multiplicação -> *
		//divisão -> /
		//resto de Divisão -> %
		
		int x = 5;
		int y = 10;
		
		int resultado;
		
		resultado = x+y;
		System.out.println("Soma: " + resultado);
		
		resultado = x-y;
		System.out.println("Subtraçãoa: " + resultado);
		
		resultado = x*y;
		System.out.println("Multiplicação: " + resultado);
		
		resultado = x/y;
		System.out.println("Divisão: " + resultado);
		
		resultado = x%y;
		System.out.println("Resto da Divisão: " + resultado);
	}

}
