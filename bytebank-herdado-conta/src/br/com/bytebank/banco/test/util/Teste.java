package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		for (Conta conta : lista) {
			System.out.println(conta);

		}

//		NumeroDaContaComparator numeroDaContaComparator = new NumeroDaContaComparator();
//		lista.sort(numeroDaContaComparator);
		lista.sort(new TitularDaContaComparator());

		Collections.sort(lista, new NumeroDaContaComparator());
		Collections.sort(lista);
//		Collections.reverse(lista);

		System.out.println("----------------");

		for (Conta conta : lista) {
			System.out.println(conta + " " + conta.getTitular().getNome());

		}

	}
}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta conta1, Conta conta2) {
		String nomeClienteUm = conta1.getTitular().getNome();
		String nomeClienteDois = conta2.getTitular().getNome();
		return nomeClienteUm.compareTo(nomeClienteDois);
	}
	
}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta conta1, Conta conta2) {
		
		return Integer.compare(conta1.getNumero(), conta2.getNumero());
		
//		return conta1.getNumero() - conta2.getNumero();

//		if (conta1.getNumero() < conta2.getNumero()) {
//			return -1;
//		}
//		if (conta1.getNumero() > conta2.getNumero()) {
//			return 1;
//		}
//
//		return 0;
	}

}
