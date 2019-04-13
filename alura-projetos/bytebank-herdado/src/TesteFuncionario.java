
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Danilo Henrique");
		funcionario.setCpf("357.128.638-39");
		funcionario.setSalario(2600.00);
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Manuco");
		funcionario2.setCpf("393.432.468-11");
		funcionario2.setSalario(2700.0);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
		
		System.out.println(funcionario2.getNome());
		System.out.println(funcionario2.getBonificacao());
		
	}
}
