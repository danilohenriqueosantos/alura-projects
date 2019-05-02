package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Domindo as cole��es do Java", "Danilo Santos");

//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));

		Aluno aluno = new Aluno("Rodrigo Turini", 34672);
		Aluno aluno2 = new Aluno("Guilherme Silveira", 5617);
		Aluno aluno3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricula(aluno);
		javaColecoes.matricula(aluno2);
		javaColecoes.matricula(aluno3);

		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(alunos -> {
			System.out.println(alunos);
		});

		System.out.println("O aluno " + aluno + " est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(aluno));

		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));

		System.out.println("O aluno � equals ao Turini?");
		System.out.println(aluno.equals(turini));
		System.out.println(aluno.hashCode() == turini.hashCode());

	}
}
