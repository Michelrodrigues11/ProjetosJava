package br.com.escola.teste;

import br.com.escola.beans.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		
		aluno.setNome("Thiago");
		aluno.setIdade(20);
		aluno.setRm(2580);
		aluno.setCursoAlocado("DS");
		
		System.out.println("O nome do do aluno é" + aluno.getNome()+
		"\n a idade do aluno é" + aluno.getIdade()+
		"\n o RM do aluno é" + aluno.getRm()+
		"\n o curso que está alocado é" + aluno.getCursoAlocado());
		
		

	}

}
