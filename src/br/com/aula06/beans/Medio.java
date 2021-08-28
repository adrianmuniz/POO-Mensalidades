package br.com.aula06.beans;

public class Medio extends Formacao {

	private String tipo;
	
	public Medio() {}

	public Medio(String descricao, int duracao, short periodo, String tipo) {
		super(descricao, duracao, periodo);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	};
	
	
	
	}
