package br.com.aula06.beans;

public class Bacharelado extends Formacao{

	private short cargaHorariaEstagio;
	private String projetoConclusao;
	
	public Bacharelado() {};
	
	public Bacharelado(String descricao, short periodo, short cargaHorariaEstagio,
			String projetoConclusao) {
		super(descricao, periodo);
		this.cargaHorariaEstagio = cargaHorariaEstagio;
		this.projetoConclusao = projetoConclusao;
	}

	public short getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}

	public void setCargaHorariaEstagio(short cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	public String getProjetoConclusao() {
		return projetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	
	@Override
	public double calcularMensalidade(double fator) {
		float mensalidade = (float) ((float) super.getDuracao() * fator * 200f + (cargaHorariaEstagio * 12));
		return mensalidade;
	}
	
	@Override
	public void definirDuracao() {
		if (super.getDescricao().equalsIgnoreCase("Engenharia")) {
			super.setDuracao(60);
		} else {
			super.setDuracao(48);
		}
	}
}
