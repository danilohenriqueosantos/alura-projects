package br.com.exercicios.modelos;

public class MultiplicacaoNumerosParesEntreZeroETrinta {

	public MultiplicacaoNumerosParesEntreZeroETrinta() {

	}

	public long multiplica() {
		long resultado = 1;
		for (int i = 1; i <= 30; i++) {
			if (i % 2 == 0) {
				resultado *= i;
			}

		}
		return resultado;
	}
	
	@Override
	public String toString() {
		return "[O retorno da multiplicação dos número pares de trinta é " + this.multiplica() + "]";
	}
}
