package br.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		
		Produto produto = new Produto("Bala Juquinha laranja", 0.15);
		
		System.out.println("A bala que ue gosto é a " + produto.getNome() + " e custa " + produto.getPreco());
	}
}
