package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel, Comparable {

	public String getTipo() {
		return "Conta Corrente";
	}

	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Voce tentou depositar um valor Menor que 0");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		}
		this.saldo -= valor - 0.10;
	}

	@Override
	public double getValorImposto() {

		return this.getSaldo() * 0.01;
	}

	@Override
	public int compareTo(Object o) {

		ContaCorrente cc = (ContaCorrente) o;

		return (int) (getSaldo() - cc.getSaldo());
	}

}
