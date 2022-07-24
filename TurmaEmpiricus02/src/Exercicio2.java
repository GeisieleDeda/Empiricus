import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n, pares=0;
		
		for(int i = 0; i < 10; i++) {
		n = scan.nextInt();
		
		boolean par = n % 2 == 0 ? true : false;
		
		if(par)
			pares++;
		}
		System.out.println("Quantidade de pares = " + pares);
		scan.close();
	}

}
