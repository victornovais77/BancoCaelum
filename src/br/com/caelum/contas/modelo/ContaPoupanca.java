package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta implements Tributavel  {

	  public String getTipo(){
		  return "Conta Poupança";
	  }

	@Override
	public double calculaRendimento() {
		
		return getSaldo() * 0.1 + 100;
	}

	@Override
	public double getValorImposto() {
		
		return 42 + this.getSaldo() * 0.02;
	}
	  
	  
}
