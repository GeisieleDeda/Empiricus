package br.com.empiricus.exemploswhile;

public class While01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		int contador = 0;
		
		while (contador <=10) {
			
			System.out.println("Repetição: " + contador);
			
			contador ++;
			Thread.sleep(1000);
		}
	}

}
