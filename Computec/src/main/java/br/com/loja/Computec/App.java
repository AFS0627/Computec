package br.com.loja.Computec;

import javax.swing.text.View;

import br.com.loja.Computec.controller.LoginController;
import br.com.loja.Computec.view.LoginView;

public class App {
    public static void main(String[] args) {
    	LoginView view = new LoginView();
    	LoginController controller = new LoginController(view);
    	view.setVisible(true);
    }
}
