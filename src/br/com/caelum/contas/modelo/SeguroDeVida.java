package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {

	private double valor;
	private String titular;
	private int numeroApolice;

	@Override
	public double getValorImposto() {
		return 42 + this.valor * 0.02;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	@Override
	public String getTipo() {
		return "Seguro de vida";
	}

	public String getTitular() {
		return titular;
	}

}