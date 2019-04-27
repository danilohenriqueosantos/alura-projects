package br.com.exercicios.modelos;

public class TestaMediaAluno {

	public static void main(String[] args) {
		
		MediaAluno mediaAluno = new MediaAluno();
		
		mediaAluno.adiciona(10);
		mediaAluno.adiciona(10);
		mediaAluno.adiciona(8);
		mediaAluno.adiciona(8);
		
		mediaAluno.quantidade();
		
		System.out.println(mediaAluno.media());
		
		
		
	}
}
