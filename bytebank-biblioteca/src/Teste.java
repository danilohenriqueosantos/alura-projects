import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		
		Conta contaCorrente = new ContaCorrente(111, 2222);
		contaCorrente.deposita(100.0);
		
		double saldo = contaCorrente.getSaldo();
		System.out.println(saldo);
	}
}
