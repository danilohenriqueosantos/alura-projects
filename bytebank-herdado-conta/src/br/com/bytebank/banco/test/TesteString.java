package br.com.bytebank.banco.test;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "Danilo";
		
//		char c = 'D';
//		char d = 'A';
//		
//		String nomeConvertido = nome.replace(c, d);
		
		System.out.println(nome.indexOf("a"));
		
		System.out.println(nome.substring(3));
		
		System.out.println(nome.isEmpty());
		
		System.out.println(nome.length());
		System.out.println(nome.contains("a"));
		
		for (int i = 0; i < nome.length(); i ++) {
			System.out.println(nome.charAt(i));
		}
//		nomeConvertido.toLowerCase();
		
//		System.out.println(nomeConvertido);
	}

}
