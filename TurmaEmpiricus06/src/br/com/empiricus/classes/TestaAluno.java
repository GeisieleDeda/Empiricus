package br.com.empiricus.classes;

public class TestaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner entrada = new Scanner()
		
		//Estanciar o objeto --> Criar o objeto....
		Aluno al1 = new Aluno();
		Aluno al2 = new Aluno();
		
		al1.nome = "Marcelo";
		al1.idade = 22;
		al1.curso = "Java - Puro";
		
		System.out.println(al1.nome);
		System.out.println(al1.idade);
		System.out.println(al1.curso);
		al1.estudar();
		
		al2.nome = "Wesley";
		al2.idade = 21;
		al2.curso = "Java - II";
		
		System.out.println();
		
		System.out.println(al2.nome);
		System.out.println(al2.idade);
		System.out.println(al2.curso);
		al2.estudar();


	}

}
