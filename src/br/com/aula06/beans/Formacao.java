package br.com.aula06.beans;

public class Formacao {

	private String descricao;
	private int duracao;
	private float mensalidade;
	private short periodo;
	
	public Formacao() {};
	
	public Formacao(String descricao, int duracao, short periodo) {
		super();
		this.descricao = descricao;
		this.duracao = duracao;
		this.periodo = periodo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public short getPeriodo() {
		return periodo;
	}

	public void setPeriodo(short periodo) {
		this.periodo = periodo;
	}
	
	public float retornarMedia (float ps1, float ps2) {
		return ps1 + ps2 / 2;
	}
	
	public float retornarMedia (float ps1, float ps2, float nac1, float nac2) {
		return (ps1 + ps2 + nac1 + nac2) / 4;
	}
	
	public float retornarMedia (float ps1, float ps2, float nac1, float nac2, float am1, float am2) {
		return (ps1 + ps2 + nac1 + nac2 + am1 + am2) / 6;
	}
}
