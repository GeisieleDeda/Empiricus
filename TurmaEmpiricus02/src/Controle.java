
public class Controle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1=10;
		int numero2=40;
		int numero3=58;
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.print("numero 1 é maior");
		} else if (numero2 > numero1 && numero2 > numero3){
			System.out.print("numero 2 é maior");
		} else {
			System.out.print("terceiro é maior");
		}
	}
}