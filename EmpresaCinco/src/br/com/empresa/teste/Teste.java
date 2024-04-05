package br.com.empresa.teste;

import javax.swing.JOptionPane;

import br.com.empresa.beans.Condominio;
import br.com.empresa.beans.Funcionario;

public class Teste extends Condominio{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Condominio condominio = new Condominio();
		Funcionario funcionario = new Funcionario();
		
		condominio.setNome("MichelThiago");
		condominio.setSexo("Masculino");
		condominio.setIdade(46);
		
		funcionario.setCargo("Alunos");
		
		System.out.println(JOptionPane.showInputDialog("Nome: "));
		System.out.println(JOptionPane.showInputDialog("Sexo: "));
		System.out.println(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
		System.out.println(JOptionPane.showInputDialog("Cargo: "));
		
		System.out.println("Nome: " + condominio.getNome()+ "\n" + "Sexo: " + condominio.getSexo() + 
				"\n" + "Idade: " + condominio.getIdade() + "\n" + "Cargo: " + funcionario.getCargo() );
	}

}
