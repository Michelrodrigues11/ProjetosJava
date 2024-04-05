package br.com.etecconexaobr.teste;

import java.sql.Connection;

import br.com.etecconexaobr.conexao.Conexao;
import br.com.etecconexaobr.dao.PessoaDAO;
import br.com.etecconexaobr.model.Pessoa;

public class Teste {

	public static void main(String[] args) {
	
		Connection con = Conexao.abrirConexao();
		
		Pessoa pessoa = new Pessoa();
		PessoaDAO pessoadao = new PessoaDAO();
		
		pessoa.setNome("Rafael");
		pessoa.setEndereco("Rua Henrique Coelho");
		
		System.out.println(pessoadao.inserir(pessoa));
		
		Conexao.fecharConexao(con);
		
		

	}
}
