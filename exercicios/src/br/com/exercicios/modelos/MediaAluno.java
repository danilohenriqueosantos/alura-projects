package br.com.exercicios.modelos;

public class MediaAluno {

	private int[] notas = new int[4];
	private static int contador = 0;

	public MediaAluno() {

	}

	public void quantidade() {

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota: " + i + " " + notas[i]);
		}
	}

	public void adiciona(int nota) {
		if (nota < 0 || nota > 100) {
			throw new RuntimeException("Valor incorreto: Somente números entre 0 e 100 são aceitos");
		}

		for (int i = 0; i < this.notas.length; i++) {

			this.notas[contador] = nota;

		}
		contador += 1;
	}

	public double media() {
		double soma = 0.0;
		for (int i = 0; i < contador; i++) {
			soma += this.notas[i];
		}
		return soma / contador;

	}

}
