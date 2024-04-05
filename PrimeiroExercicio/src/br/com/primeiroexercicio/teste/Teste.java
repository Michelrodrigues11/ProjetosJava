package br.com.primeiroexercicio.teste;

import javax.swing.JOptionPane;

import br.com.primeiroexercicio.beans.Animal;
import br.com.primeiroexercicio.beans.Mamifero;

public class Teste extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamifero mamifero = new Mamifero();
		

		
		mamifero.setEspecie(JOptionPane.showInputDialog("A espécie é: \n"));
		mamifero.setNome(JOptionPane.showInputDialog("O nome do animal é: \n"));
		mamifero.setIdade(Integer.parseInt(JOptionPane.showInputDialog("A idade do animal é: \n")));
		mamifero.setMesesGestacao(Integer.parseInt(JOptionPane.showInputDialog("Meses de gestação do animal: ")));
		
		System.out.println("A espécie é: " + mamifero.getEspecie() + "\n" + "o nome do animal é: " 
				+ mamifero.getNome() + "\n" + "a idade do animal é: " + mamifero.getIdade() + "\n" + 
				"meses de gestação do animal"+ mamifero.getMesesGestacao());

	}

}
