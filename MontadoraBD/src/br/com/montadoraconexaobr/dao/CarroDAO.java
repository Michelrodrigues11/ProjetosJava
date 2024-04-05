package br.com.montadoraconexaobr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.montadorabd.model.Automovel;
import br.com.montadorabd.model.Carro;

public class CarroDAO {
	private Connection con;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public CarroDAO() {
	}

	public CarroDAO(Connection con) {
		setCon(con);
	}

	public String inserir(Carro carro) {
		String sql = "insert into carro(montadora, carro) values (?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getNomeMontadora());
			ps.setString(2, carro.getModeloCarro());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String deletar(Carro carro) {
		String sql = "delete from carro where montadora = (?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getNomeMontadora());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro ao Deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String deletarSemWhere(Carro carro) {
		String sql = "delete from montadora";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getNomeMontadora());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro ao Deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}
