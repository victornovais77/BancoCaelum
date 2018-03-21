package br.com.caelum.contas;

import java.io.FileNotFoundException;

public class TestaErro {

	public static void main(String[] args) {
		
		try {
			new java.io.FileInputStream("arquivo.TXT");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("inicio do main");

		metodo1();

		System.out.println("fim do main");

	}

	public static void metodo1() {
		System.out.println("inicio do metodo 1");

		metodo2();

		System.out.println("fim do metodo 1");
	}

	public static void metodo2(){
		System.out.println("inicio do metodo 2");

		int[] array = new int[10];
		try {
			for (int i = 0; i < 15; i++) {

				array[i] = i * i;
				System.out.println(array[i]);

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Deu Ruim");
		}

		System.out.println("fim do metodo 2");
	}

}


