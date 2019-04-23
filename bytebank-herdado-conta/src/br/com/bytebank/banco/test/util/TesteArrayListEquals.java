package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ContaCorrente contaCorrente = new ContaCorrente(111, 222);
		lista.add(contaCorrente);
		
		ContaCorrente contaCorrente2 = new ContaCorrente(111, 223);
		lista.add(contaCorrente2);
		
		ContaCorrente contaCorrente3 = new ContaCorrente(111, 222);
		lista.add(contaCorrente3);
		
		ContaCorrente contaCorrente4 = new ContaCorrente(111, 223);
		lista.add(contaCorrente4);
		
		System.out.println(lista.size());
		
		Conta object = (Conta) lista.get(0);
		System.out.println(object);
		
		lista.remove(0);
		
		System.out.println(lista.size());
		
		for (int i = 0; i < lista.size(); i ++) {
			System.out.println(lista.get(i));
		}
		
		for (Conta conta : lista) {
			System.out.println(conta);
			
		}
		
		boolean contains = lista.contains(contaCorrente2);
		System.out.println("Já existe? " + contains);
		
	}
}
