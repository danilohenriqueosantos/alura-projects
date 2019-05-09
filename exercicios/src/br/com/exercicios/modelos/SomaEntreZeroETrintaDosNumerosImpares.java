package br.com.exercicios.modelos;

public class SomaEntreZeroETrintaDosNumerosImpares {

	public SomaEntreZeroETrintaDosNumerosImpares() {
		// TODO Auto-generated constructor stub
	}

	public int soma() {
		int resultado = 0;
		for (int i = 0; i <= 30; i++) {
			if (i % 2 != 0) {
				resultado += i;
			}
		}

		return resultado;
	}

	@Override
	public String toString() {
		return "[O retorno da soma dos número ímpares de trinta é " + this.soma() + "]";
	}
}
