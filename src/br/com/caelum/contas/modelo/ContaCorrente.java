package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel,Comparable {
	
	public String getTipo(){
		  return "Conta Corrente";
	  }
	
	public boolean saca (double valor){
		if(valor > 0 && saldo >= valor){
            saldo = saldo + valor + 0.10;
            System.out.println("Sacado");
            return true;
       }else{
            System.out.println("erro ao sacar");
            return false;
       }
		
	}

	@Override
	public double getValorImposto() {
		
		return this.getSaldo() * 0.01;
	}

	@Override
	public int compareTo(Object o) {
		
			ContaCorrente cc =  (ContaCorrente) o;
		
		return (int) ( getSaldo() - cc.getSaldo());
	}

}
