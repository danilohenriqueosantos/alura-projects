package br.com.alura.bytebank.banco.modelo;

public class SeguraDeVida implements Tributavel{

	@Override
	public double getValorImposto() {
		return 42;
	}

}