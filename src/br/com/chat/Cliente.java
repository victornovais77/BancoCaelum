package br.com.chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args)throws UnknownHostException,IOException {
		new Cliente("192.168.0.227",5234).executa();
		

	}
	
	private String host;
	private int porta;
	
	public Cliente(String host, int porta){
		this.host = host;
		this.porta = porta;
	}
	
	public void executa()throws UnknownHostException,IOException {
		Socket cliente = new Socket(this.host,this.porta);
		System.out.println("O cliente se conectou ao servidor");
		
		Recebedor r = new Recebedor(cliente.getInputStream());
		new Thread(r).start();
		
		Scanner teclado = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		while(teclado.hasNext()){
			saida.println(teclado.nextLine());
		}
		
		saida.close();
		teclado.close();
		cliente.close();
	}

}
