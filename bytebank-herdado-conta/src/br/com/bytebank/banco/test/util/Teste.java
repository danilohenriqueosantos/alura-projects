package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

		Conta contaCorrente = new ContaCorrente(111, 444);
		contaCorrente.deposita(100.0);

		Conta contaPoupanca = new ContaPoupanca(111, 333);
		contaPoupanca.deposita(150.0);

		Conta contaCorrente2 = new ContaCorrente(111, 222);
		contaCorrente2.deposita(130.0);

		Conta contaPoupanca2 = new ContaPoupanca(111, 555);
		contaPoupanca2.deposita(160.0);

		List<Conta> lista = new ArrayList<Conta>();

		lista.add(contaCorrente);
		lista.add(contaPoupanca);
		lista.add(contaCorrente2);
		lista.add(contaPoupanca2);
		
		for (Conta conta : lista) {
			System.out.println(conta);
			
		}
		
		NumeroDaContaComparator numeroDaContaComparator = new NumeroDaContaComparator();
		
		lista.sort(numeroDaContaComparator);
		
		System.out.println("----------------");
		
		for (Conta conta : lista) {
			System.out.println(conta);
			
		}

	}
}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta conta1, Conta conta2) {

		if (conta1.getNumero() < conta2.getNumero()) {
			return -1;
		}
		if (conta1.getNumero() > conta2.getNumero()) {
			return 1;
		}

		return 0;
	}

}
