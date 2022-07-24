package br.com.empiricus.exemplosdowhile;

public class DoWhile01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int i = 0;
		
		do {
			System.out.println(i);
			++i;
			Thread.sleep(500);			
		}while(i <= 10);
	}

}
