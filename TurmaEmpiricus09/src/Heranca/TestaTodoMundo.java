package Heranca;

public class TestaTodoMundo {

	public static void main(String[] args) {
		
		Professor prof1 = new Professor();
		
		
		prof1.setNome("Jonatas");
		prof1.setIdade(22);
		prof1.setSalario(1000.00);
		prof1.setEndereco("Rua da Prais, 1500");
		prof1.setDisciplina("Java");
		
		System.out.println("Nome do Professor(a): " + prof1.getNome());
		System.out.println(prof1.getIdade());
		System.out.println(prof1.getSalario());
		System.out.println(prof1.getEndereco());
		System.out.println(prof1.getDisciplina());
	}

}
