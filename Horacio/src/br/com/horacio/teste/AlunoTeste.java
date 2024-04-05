package br.com.horacio.teste;

import javax.swing.JOptionPane;

import br.com.horacio.model.Aluno;

public class AlunoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		
		Aluno aluno01 = new Aluno();
		
		/*String recebeNome = JOptionPane.showInputDialog("Nome");
		String recebeCurso = JOptionPane.showInputDialog("Curso");
		String recebeIdade = JOptio("Idade");*/
		
		aluno01.setNome("JOptionPane.showInputDialog(\"Nome\"");
		aluno01.setCursoAlocado("JOptionPane.showInputDialog(\"Curso\")");
		aluno01.setIdade(17);
		
		aluno.setNome("JOptionPane.showInputDialog(\"Nome\")");
		aluno.setCursoAlocado("JOptionPane.showInputDialog(\"Curso\"");
		aluno.setIdade(36);
		
		System.out.println("O nome do aluno é " + aluno.getNome() +
		"\n o curso que está alocado é " + aluno.getCursoAlocado()+ 
		"\n o aluno possui " + aluno.getIdade());
		
		 System.out.println("o nome do aluno é " + aluno01.getNome()+ 
		"\n o curso que está alocado é " + aluno01.getCursoAlocado()+
		"\n o aluno possui " + aluno01.getIdade());
	}

}
