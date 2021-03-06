package br.com.caelum.contas.modelo;

/**
 * 
 * @author oo7297
 *
 */

public abstract class Conta {
	private int numero;
	private String titular;
	protected double saldo;
	private double limite;
	private String agencia;

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String string) {
		this.agencia = string;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	/**
	 * 
	 * @param valor
	 *            valor a ser sacado da conta
	 * @return true se sacou
	 */
	public void saca(double valor) {
		if (saldo > valor) {
			this.saldo -= valor;
		}else {
			throw new IllegalArgumentException("Voce tentou depositar um valor Menor que 0");
		}
	}

	@Override
	public String toString() {
		return titular;
	}

	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			throw new IllegalArgumentException("Voce tentou depositar um valor negativo");
		}

	}

	public void transfere(Conta destino, double valor) {
		saca(valor);
		destino.deposita(valor);
	}

	public double calculaRendimento() {

		return saldo * 0.1;
	}

	public abstract String getTipo();

}
