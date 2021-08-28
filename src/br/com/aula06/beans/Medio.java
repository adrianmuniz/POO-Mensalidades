package br.com.aula06.beans;

public class Medio extends Formacao {

	private String tipo;
	
	public Medio() {}

	public Medio(String descricao, short periodo, String tipo) {
		super(descricao, periodo);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	};
	
	@Override
	public double calcularMensalidade(double fator) {
		float mensalidade = (float) (super.getDuracao() * fator * 100f);
		return mensalidade;
	}
	
	@Override
	public void definirDuracao() {
		if (getDuracao() == 36) {
			System.out.println("O aluno está no Ensino Médio");
			setDuracao(36);
		}
	}
}
