package br.com.escola.beans;

public class Aluno extends Pessoa {

	public int getRm() {
		return Rm;
	}

	public void setRm(int rm) {
		Rm = rm;
	}

	public String getCursoAlocado() {
		return CursoAlocado;
	}

	public void setCursoAlocado(String cursoAlocado) {
		CursoAlocado = cursoAlocado;
	}

	private int Rm;

	private String CursoAlocado;

}
