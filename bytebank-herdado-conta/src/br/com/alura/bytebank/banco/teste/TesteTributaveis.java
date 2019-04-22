package br.com.alura.bytebank.banco.teste;

import br.com.alura.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.alura.bytebank.banco.modelo.ContaCorrente;
import br.com.alura.bytebank.banco.modelo.SeguraDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(222, 333);
		contaCorrente.deposita(100.0);
		
		SeguraDeVida seguraDeVida = new SeguraDeVida();
		
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		calculadorDeImposto.registra(contaCorrente);
		calculadorDeImposto.registra(seguraDeVida);
		
		
		System.out.println(calculadorDeImposto.getTotalImposto());
	}
}