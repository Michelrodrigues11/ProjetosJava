package br.com.montadorabr.teste;

import java.sql.Connection;

import br.com.montadorabd.model.Carro;
import br.com.montadoraconexaobr.com.Conexao;
import br.com.montadoraconexaobr.dao.CarroDAO;

public class TesteDeletarSemWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();

		Carro carro = new Carro();
		CarroDAO carrodao = new CarroDAO(con);

		carro.setModeloCarro("vitara");
		carro.setNomeMontadora("Suzuki");

		System.out.println(carrodao.deletar(carro));

		Conexao.fecharConexao(con);
	}

}
