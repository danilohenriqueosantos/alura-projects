package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Domindo as cole��es do Java", "Danilo Santos");
		
//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));
		
		System.out.println(javaColecoes.getAulas());
	}
}
