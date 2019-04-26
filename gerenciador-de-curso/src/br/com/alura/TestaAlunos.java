package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");

		for (String aluno : alunos) {
			System.out.println(aluno);

		}

		boolean PauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio Lopes");
		System.out.println(PauloEstaMatriculado);

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		
		List<String> alunosEmLista = new ArrayList<>(alunos);
	}

}
