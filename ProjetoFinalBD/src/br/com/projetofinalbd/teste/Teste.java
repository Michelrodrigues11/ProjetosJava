package br.com.projetofinalbd.teste;

import java.sql.Connection;

import br.com.projetofinalbd.conexao.Conexao;
import br.com.projetofinalbd.dao.PessoaDAO;
import br.com.projetofinalbd.model.Pessoa;

public class Teste {

	public static void main(String[] args) {

Connection con = Conexao.abrirConexao();
		
		Pessoa pessoa = new Pessoa();
		PessoaDAO pessoadao = new PessoaDAO(con);
		
		pessoa.setNome("Michel Henrique");
		pessoa.setEndereco("Rua Henrique Coelho");
		
		
		System.out.println(pessoadao.inserir(pessoa));
		
		Conexao.fecharConexao(con);

	}

}
