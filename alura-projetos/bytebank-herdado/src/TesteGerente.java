public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Danilo");
		gerente.setCpf("123456789");
		gerente.setSalario(5000.0);
		
		Gerente gerente2 = new Gerente();
		gerente2.autentica(5555);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(2222);
		
		boolean autenticou = gerente.autentica(2222);
		System.out.println(autenticou);
		
		boolean verifica = gerente2.autentica(2121);
		System.out.println(verifica);

		Gerente gerente3 = new Gerente();
		gerente3.autentica(2121);
		
		
	}
}
