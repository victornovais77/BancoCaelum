package br.caelum.contas.concorrente;

public class TestaPrograma {

	public static void main(String[] args) {
		Programa p1 = new Programa(1);
		Programa p2 = new Programa(2);
		Programa p3 = new Programa(3);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
