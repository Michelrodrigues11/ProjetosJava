package br.com.fabricaroupa.teste;

import java.sql.Connection;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.CalcaDAO;
import br.com.fabricaroupa.model.Calca;


public class TesteInserirCalca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();

		Calca calca = new Calca();
		CalcaDAO calcadao = new CalcaDAO(con);

	
		calca.setPeso(200);
		calca.setTipo("SPORT Fino");
		calca.setTipoTecido("sarja");

		System.out.println(calcadao.inserir(calca));

		Conexao.fecharConexao(con);
	}

}
