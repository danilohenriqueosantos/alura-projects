package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeAula {

	public static void main(String[] args) {
		
		Aula aula = new Aula("Revisitando as ArrayLists", 21);
		Aula aula2 = new Aula("Lista de objetos", 20);
		Aula aula3 = new Aula("Relacionamento de lista e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(aula);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		System.out.println(aulas.get(0));
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		
	}
}
