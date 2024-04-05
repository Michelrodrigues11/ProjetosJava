package br.com.empresa.beans;

public class Funcionario extends Condominio {
	private String cargo;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void mostrarAtributo()
	{
		this.getNome();
		this.getSexo();
		this.getIdade();
		this.getCargo();
	}
}
