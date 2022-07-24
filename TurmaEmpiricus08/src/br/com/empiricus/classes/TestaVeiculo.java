package br.com.empiricus.classes;

public class TestaVeiculo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Veiculo v1 = new Veiculo();
		Veiculo v2 = new Veiculo();
		
				
		v1.setModelo("Corcel - sedan");
		v1.setMarca("Ford");
		v1.setAno(1978);
		
		
		
		System.out.println("Modelo: " + v1.getModelo());
		System.out.println("Marca: " + v1.getMarca());
		System.out.println("Ano: " + v1.getAno());
		//System.out.println(v1.velocidade);
		
		v1.acelerar(3);
		v1.freiar(1);
		
		
	}

}
