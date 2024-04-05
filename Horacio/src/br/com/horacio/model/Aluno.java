package br.com.horacio.model;

public class Aluno extends PessoaModel {
	
 private String CursoAlocado;
 private int Idade;
public String getCursoAlocado() {
	return CursoAlocado;
}
public void setCursoAlocado(String cursoAlocado) {
	CursoAlocado = cursoAlocado;
}
public int getIdade() {
	return Idade;
}
public void setIdade(int idade) {
	Idade = idade;
}




}
