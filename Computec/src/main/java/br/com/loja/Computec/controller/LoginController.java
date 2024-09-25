package br.com.loja.Computec.controller;

import javax.swing.JOptionPane;
import javax.swing.text.View;

import br.com.loja.Computec.model.UsuarioModel;
import br.com.loja.Computec.view.LoginView;

public class LoginController {
private LoginView view;
private UsuarioModel model;

public LoginController(LoginView view) {
	this.view = view;
	this.model = new UsuarioModel();
	
	if(model.conexao !=null) {
		view.lblStatus.setText("conectado ao banco de dados");
		System.out.println("conectado");
	}else {
		System.out.println("não conectado");

	}
	this.view.btnLogin.addActionListener(e -> logar());
}
public void logar() {
	String login = view.txtUsuario.getText();
	String senha = new String(view.txtSenha.getPassword());
	String perfil = model.autenticar(login, senha);
	
	if(perfil != null) {
		JOptionPane.showMessageDialog(null,  "acesso concedido");
	}else {
		JOptionPane.showMessageDialog(null,  "login ou senha incorretos");
	}
}
}
