
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Joao");
		funcionario.setCpf("111.222.333.44");
		funcionario.setSalario(2600.00);
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Maria");
		funcionario2.setCpf("111.222.333.44");
		funcionario2.setSalario(2700.0);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
		
		System.out.println(funcionario2.getNome());
		System.out.println(funcionario2.getBonificacao());
		
	}
}
