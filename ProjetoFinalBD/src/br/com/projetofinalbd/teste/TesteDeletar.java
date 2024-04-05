package br.com.projetofinalbd.teste;

import java.sql.Connection;

import br.com.projetofinalbd.conexao.Conexao;
import br.com.projetofinalbd.dao.PessoaDAO;
import br.com.projetofinalbd.model.Pessoa;

public class TesteDeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = Conexao.abrirConexao();

		Pessoa pessoa = new Pessoa();
		PessoaDAO pessoadao = new PessoaDAO(con);

		pessoa.setNome("Michel Henrique");
		System.out.println(pessoadao.deletar(pessoa));

		Conexao.fecharConexao(con);

	}

}
