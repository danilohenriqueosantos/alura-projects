package br.com.exercicios.modelos;

public class ComparaNumero {

	
	public ComparaNumero() {
	}
	
	public void maiorNumero(int a, int b) {
		 int maior = Integer.compare(a, b);
		 if (maior >= 1 ) {
			 System.out.println("Diferentes! Maior número é " + a + " Menor " + b );
		 } else if (maior <= -1 ) {
			 System.out.println("Diferentes! Maior número é " + b + " Menor " + a);
		 } else {
			 System.out.println("Os números são iguais");
		 }
		
	}

}

