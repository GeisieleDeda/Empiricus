import java.util.Scanner;

public class Operadorternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada	= new Scanner (System.in);
		
		System.out.println("Informe o numero1:");
		int numero1 =  entrada.nextInt();

		System.out.println("Informe o numero2:");
		int numero2 =  entrada.nextInt();
		
		int maior = 0;
		
		maior = numero1 > numero2 ? numero1 : numero2;
		
		System.out.println("Valor:" + maior*10);

	}

}
