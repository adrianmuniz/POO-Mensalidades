package br.com.aula06.beans;

public class Tecnologo extends Formacao {

	private boolean planoEstendido;
	
	public Tecnologo() {}

	public Tecnologo(String descricao, short periodo, boolean planoEstendido) {
		super(descricao, periodo);
		this.planoEstendido = planoEstendido;
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	};
	
	
	@Override
	public double calcularMensalidade(double fator) {
		float mensalidade = (float) (super.getDuracao() * fator * 200f);
		return mensalidade;
	}
	
	@Override
	public void definirDuracao() {
			System.out.println("O aluno está no Tecnologo");
			setDuracao(24);
		}
	
}
