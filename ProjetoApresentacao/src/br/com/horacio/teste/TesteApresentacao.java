package br.com.horacio.teste;

import javax.swing.JOptionPane;

public class TesteApresentacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "Matheus";
		
	
		int idade1 = 22;
		
		
		System.out.println("Meu nome é \n" + name1 + " e tenho " + idade1 + " anos " );
		
		String nomeDois = "Michel";
		
		String nomeTres = JOptionPane.showInputDialog("Digite o seu nome");
		System.out.println(nomeTres);
		
		String idade2 = JOptionPane.showInputDialog("Digite a sua idade");
		System.out.println(idade2);

	}

}
