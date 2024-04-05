package br.com.construtora.model;

public class Imovel {
	
private String Nome;

private Double MetrosQuadrados;

private int QuantidadeQuartos;

public String getNome() {
	return Nome;
}

public void setNome(String nome) {
	Nome = nome;
}

public Double getMetrosQuadrados() {
	return MetrosQuadrados;
}

public void setMetrosQuadrados(double metrosQuadrados) {
	MetrosQuadrados = metrosQuadrados;
}

public int getQuantidadeQuartos() {
	return QuantidadeQuartos;
}

public void setQuantidadeQuartos(int quantidadeQuartos) {
	QuantidadeQuartos = quantidadeQuartos;
}
}
