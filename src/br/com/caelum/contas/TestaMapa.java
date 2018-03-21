package br.com.caelum.contas;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {

	public static void main(String[] args) {
		Map<String,String> dicionario = new HashMap<>();
		dicionario.put("bola", "ball");
		dicionario.put("mesa", "table");
		dicionario.put("lapis", "pancil");
		System.out.println(dicionario.get("mesa"));

	}

}
