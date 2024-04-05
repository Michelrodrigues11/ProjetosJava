package br.com.escola.beans;

public class Professor extends Pessoa {
	private float Salario;

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		Salario = salario;
	}

	public String getCursoAlocado() {
		return CursoAlocado;
	}

	public void setCursoAlocado(String cursoAlocado) {
		CursoAlocado = cursoAlocado;
	}

	private String CursoAlocado;

}
