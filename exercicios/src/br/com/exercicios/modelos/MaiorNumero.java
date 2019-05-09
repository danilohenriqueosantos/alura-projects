package br.com.exercicios.modelos;

public class MaiorNumero {
	
	public MaiorNumero() {
	}
	
	public void maiorNumero(int a, int b) {
		 int maior = Integer.compare(a, b);
		 if (maior >= 1 ) {
			 System.out.println("Maior número é " + a);
		 } else if (maior <= -1 ) {
			 System.out.println("Maior número é " + b);
		 } else {
			 System.out.println("Os números são iguais");
		 }
		
	}

}
