package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {
	
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		ContaCorrente contaCorrente = new ContaCorrente(111, 222);
		guardador.adiciona(contaCorrente);
		
		ContaCorrente contaCorrente2 = new ContaCorrente(111, 223);
		guardador.adiciona(contaCorrente2);
		
		ContaCorrente contaCorrente3 = new ContaCorrente(111, 223);
		guardador.adiciona(contaCorrente3);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref1 = guardador.getReferencia(0);
		System.out.println(ref1);
		
		Conta ref2 = guardador.getReferencia(1);
		System.out.println(ref2);
		
		Conta ref3 = guardador.getReferencia(0);
		System.out.println(ref3);
		
		
	}

}
