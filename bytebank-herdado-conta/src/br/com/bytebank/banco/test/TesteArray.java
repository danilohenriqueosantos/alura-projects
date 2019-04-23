package br.com.bytebank.banco.test;

public class TesteArray {
	
	public static void main(String[] args) {
		
		int[] idades = new int[5];
				
		
		int idade1 = 19;
		int idade2 = 29;
		int idade3 = 39;
		int idade4 = 49;
		int idade5 = 59;
		
		idades[0] = idade1;
		idades[1] = idade2;
		idades[2] = idade3;
		idades[3] = idade4;
		idades[4] = idade5;
		
		System.out.println(idades[0]);
		
		System.out.println(idades.length);
	}

}
