package br.com.fabricacalcado.model;

public class Sapato extends Calcado {
	public String getTipoTecido() {
		return tipoTecido;
	}

	public void setTipoTecido(String tipoTecido) {
		this.tipoTecido = tipoTecido;
	}

	private String tipoTecido;
}
