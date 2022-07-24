package br.com.geisiele.exercicio04;

public class ImprimeAnimal {

	public static void main(String[] args) {
		
		TestaAnimal t = new TestaAnimal();
		
		Cachorro cr = new Cachorro();
		t.animalEmitirSom(cr);
		cr.corre();
		
		Cavalo cv = new Cavalo();
		t.animalEmitirSom(cv);
		cv.corre();
		
		Preguica pr = new Preguica();
		t.animalEmitirSom(pr);
		pr.sobeArvore();
	}

}
