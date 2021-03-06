package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa a moldura de uma conta
 * 
 * @author Danilo Henrique
 * @version 0.1
 * 
 */

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

	private static final long serialVersionUID = 1L;
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	/**
	 * Construtor para inicializar o objeto Conta a partir da ag�ncia e n�mero
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
//        System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
//        this.saldo = 100;
//        System.out.println("Estou criando uma conta " + this.numero);
	}

	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @return boolean
	 */
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public boolean equals(Object ref) {

		Conta outraConta = (Conta) ref;

		if (this.agencia != outraConta.agencia) {
			return false;
		}

		if (this.numero != outraConta.numero) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "N�mero: " + this.numero + ", Ag�ncia: " + this.agencia + ", Saldo: " + this.saldo;
	}

	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}

}