public class Conta{

    private double saldo;
    private int agencia;
    private int numero;
    private String titular;
    
    public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void deposita(double valor) {
    	this.saldo += valor;
    }
    
    public boolean saca(double valor) {
    	if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
    	} return false;
    }
    
    public boolean transfere(double valor, Conta destino) {
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		destino.deposita(valor);
    		return true;
    	} return false;
    }

}