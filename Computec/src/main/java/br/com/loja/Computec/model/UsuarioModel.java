package br.com.loja.Computec.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.loja.Computec.dal.ModuloConexao;

public class UsuarioModel {
public Connection conexao = null;
private PreparedStatement pst = null;
private ResultSet rs = null;

public UsuarioModel() {
	conexao = ModuloConexao.conector();
		
}
}
