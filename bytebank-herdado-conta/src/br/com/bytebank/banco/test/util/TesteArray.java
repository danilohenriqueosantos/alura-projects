package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteArray {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		String[] nomes = new String[5];
		
		int idade = 29;
		
		Integer idadeRef = Integer.valueOf(29);
		int intValue = idadeRef.intValue();
		
		String s = args[0];
		
//		Integer numero = Integer.valueOf(s);
		
		int numero = Integer.parseInt(s);
		
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade);
	}
}
