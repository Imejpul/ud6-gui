package com.ivanmejia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioSesion {
    private JPanel inicioSesion;
    private JButton entrar;
    private JPasswordField passCampo;
    private JTextField usuarioCampo;
    private JLabel usuario;
    private JLabel pass;

    //variables información usuario
    private final String user = "Ivan Mejia";
    private final String contrasenya = "12345";

    public InicioSesion() {
        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Inicio de Sesión");
        frame.setContentPane(new InicioSesion().inicioSesion);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
