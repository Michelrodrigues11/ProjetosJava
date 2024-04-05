package br.com.fabricacalcado.teste;

import java.sql.Connection;

import br.com.fabricacalcado.conexao.Conexao;
import br.com.fabricacalcado.dao.ChineloDAO;
import br.com.fabricacalcado.model.Chinelo;

public class TesteInserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();

		Chinelo chinelo = new Chinelo();
		ChineloDAO chinelodao = new ChineloDAO(con);

		chinelo.setTamanho(42);
		chinelo.setPeso(200);
		chinelo.setNome("Havaiana de pau");
		chinelo.setQuantidadeTiras(2);

		System.out.println(chinelodao.inserir(chinelo));

		Conexao.fecharConexao(con);

	}
}
