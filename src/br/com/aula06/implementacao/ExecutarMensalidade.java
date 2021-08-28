package br.com.aula06.implementacao;

import java.util.Scanner;

import br.com.aula06.beans.Formacao;
import br.com.aula06.beans.Medio;

public class ExecutarMensalidade extends Formacao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		
		Medio m = new Medio("Curso TI", (short) 1, "Presencial");
		
		System.out.println(m.calcularMensalidade(100.0));
		System.out.println(m.retornarMedia(5.0f, 7.0f));
		m.definirDuracao();
		System.out.println(m.getDuracao());
	}

}
