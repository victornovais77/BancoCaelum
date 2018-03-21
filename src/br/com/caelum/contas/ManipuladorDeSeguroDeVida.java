package br.com.caelum.contas;

import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeSeguroDeVida {

	private SeguroDeVida segurodevida;
	
	public void criaSeguro(Evento evento){
		this.segurodevida = new SeguroDeVida();
		this.segurodevida.setNumeroApolice(evento.getInt("numeroApolice"));
		this.segurodevida.setTitular(evento.getString("titular"));
		this.segurodevida.setValor(evento.getDouble("valor"));
	}
}
