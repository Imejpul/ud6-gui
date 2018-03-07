package com.imejpul;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contactos {
    private JPanel contactosPanel;
    private JButton button1;
    private JButton button2;
    private JLabel labelNombre;
    private JLabel labelTelefono;
    private JLabel labelEmail;
    private JLabel labelResNom;
    private JLabel labelResTelf;
    private JLabel labelResEmail;

    public Contactos() {

        JFrame frame = new JFrame("Contactos");
        frame.setContentPane(contactosPanel);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {

    }
}
