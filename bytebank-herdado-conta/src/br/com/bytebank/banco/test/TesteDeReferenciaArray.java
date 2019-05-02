package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteDeReferenciaArray {
	
	public static void main(String[] args) {
		
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente contaCorrente = new ContaCorrente(111, 222);
		contas[0] = contaCorrente;
		
		ContaCorrente contaCorrente2 = new ContaCorrente(222, 333);
		contas[1] = contaCorrente2;
		
		System.out.println(contas[1].getNumero());
	}

}
