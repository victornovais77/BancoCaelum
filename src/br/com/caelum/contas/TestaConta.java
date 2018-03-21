package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaConta {
	
	 public static void main(String[] args) {
		Conta c = new ContaCorrente();
        System.out.println(c);
	}

}
