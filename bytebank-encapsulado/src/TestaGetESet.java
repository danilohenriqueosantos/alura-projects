
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		System.out.println(conta.getNumero());
		
		Cliente danilo = new Cliente();
		danilo.setNome("Danilo");
		conta.setTitular(danilo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
	}
}
