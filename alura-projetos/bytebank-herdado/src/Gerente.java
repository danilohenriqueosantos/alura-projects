
public class Gerente extends Funcionario {

	private int senha;

	public Gerente() {

	}

	public double getBonificacao() {
		return super.getSalario() * 0.2;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
