package br.com.chat;

import java.io.InputStream;
import java.util.Scanner;

public class Recebedor implements Runnable {

	
	private InputStream servidor;
	
	public Recebedor(InputStream servidor){
		this.servidor = servidor;
	}
	@Override
	public void run() {
		Scanner s = new Scanner(System.in);
		System.out.println(this.servidor);
		while(s.hasNext()){
			System.out.println(s.nextLine());
		}
		
		
	}

}
