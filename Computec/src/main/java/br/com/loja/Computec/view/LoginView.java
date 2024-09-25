package br.com.loja.Computec.view;

import javax.swing.*;

public class LoginView {

    private JFrame frame;
    public JTextField txtUsuario;
    public JPasswordField txtSenha;
    public JLabel lblStatus;
    public JButton btnLogin;

    /**
     * Launch the application.
     */


    /**
     * Create the application.
     */
    public LoginView() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("X System - Login");
        frame.setBounds(100, 100, 400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);


        JLabel lblUsuario = new JLabel("Usuário:");
        lblUsuario.setBounds(50, 50, 70, 14);
        frame.getContentPane().add(lblUsuario);
        txtUsuario = new JTextField();
        txtUsuario.setBounds(130, 50, 200, 25);
        frame.getContentPane().add(txtUsuario);
        txtUsuario.setColumns(10);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(50, 100, 70, 14);
        frame.getContentPane().add(lblSenha);

        txtSenha = new JPasswordField();
        txtSenha.setBounds(130, 100, 200, 25);
        frame.getContentPane().add(txtSenha);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(130, 150, 100, 30);
        frame.getContentPane().add(btnLogin);

        ImageIcon icon = new ImageIcon("caminho/para/sua/imagem.png");
        JLabel labelIcon = new JLabel(icon);
        labelIcon.setBounds(10, 150, 30, 30);
        frame.getContentPane().add(labelIcon);
        
        lblStatus = new JLabel("");
        lblStatus.setBounds(10, 170, 46, 14);
        frame.getContentPane().add(lblStatus);
    }
}
