package com.ivanmejia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class InicioSesion {
    private JPanel inicioSesion;
    private JButton entrar;
    private JPasswordField passCampo;
    private JTextField usuarioCampo;
    private JLabel usuario;
    private JLabel pass;

    //variables información usuario
    private final String user = "ivan";
    private final String contrasenya = "12345";

    public InicioSesion() {
        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                char[] pwd = new char[5];

                //convertimos la contraseña por defecto a Array de caracteres
                for (int i = 0; i < 5; i++) {
                    pwd[i] = contrasenya.charAt(i);
                }

                if (usuarioCampo.getText().equalsIgnoreCase(user) && Arrays.equals(passCampo.getPassword(), pwd)) {

                    JOptionPane.showMessageDialog(null, "OK", "Resultado", JOptionPane.INFORMATION_MESSAGE);

                } else {

                    JOptionPane.showMessageDialog(null, "ERROR", "Resultado", JOptionPane.ERROR_MESSAGE);
                }

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
