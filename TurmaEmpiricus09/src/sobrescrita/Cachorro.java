package sobrescrita;

public class Cachorro extends Animal {
	
	//@Override significa sobrescrita
	public void comer() {
		System.out.println("Cachorro comendo...");
	}
	
	public void somAnimal() {
		System.out.println("Som do Cachorro: au au");
	}
}
