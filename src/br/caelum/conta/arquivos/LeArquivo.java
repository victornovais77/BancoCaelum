package br.caelum.conta.arquivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


public class LeArquivo {

	public static void main(String[] args)throws IOException {
		InputStream is = new URL("http://www.google.com.br").openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		
		while(s != null){
			System.out.println(s);
			s = br.readLine();
		}

	}

}
