package br.com.primeiroexercicio.teste;

import javax.swing.JOptionPane;

import br.com.primeiroexercicio.beans.Animal;
import br.com.primeiroexercicio.beans.Mamifero;

public class Teste extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamifero mamifero = new Mamifero();
		

		
		mamifero.setEspecie(JOptionPane.showInputDialog("A esp�cie �: \n"));
		mamifero.setNome(JOptionPane.showInputDialog("O nome do animal �: \n"));
		mamifero.setIdade(Integer.parseInt(JOptionPane.showInputDialog("A idade do animal �: \n")));
		mamifero.setMesesGestacao(Integer.parseInt(JOptionPane.showInputDialog("Meses de gesta��o do animal: ")));
		
		System.out.println("A esp�cie �: " + mamifero.getEspecie() + "\n" + "o nome do animal �: " 
				+ mamifero.getNome() + "\n" + "a idade do animal �: " + mamifero.getIdade() + "\n" + 
				"meses de gesta��o do animal"+ mamifero.getMesesGestacao());

	}

}
