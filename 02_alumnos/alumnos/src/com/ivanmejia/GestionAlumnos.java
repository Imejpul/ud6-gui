package com.ivanmejia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GestionAlumnos {
    private JTextField name;
    private JPanel panel1;
    private JTextField lastNames;
    private JTextField telf;
    private JTextField mail;
    private JLabel nombre;
    private JLabel apellidos;
    private JLabel telefono;
    private JLabel email;
    private JButton lista;
    private JButton save;

    private List<Alumno> alumnos = new ArrayList<>();

    public GestionAlumnos() {
        lista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //recorro la lista de alumnos enseñándola en el JTextArea
                for (Alumno a : alumnos) {

                }

            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int telefono = Integer.parseInt(telf.getText());

                boolean grabado = alumnos.add(new Alumno(name.getText(), lastNames.getText(), telefono, mail.getText()));
                if (grabado) {
                    JOptionPane.showMessageDialog(null, "OK", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gestion Alumnos");
        frame.setContentPane(new GestionAlumnos().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
