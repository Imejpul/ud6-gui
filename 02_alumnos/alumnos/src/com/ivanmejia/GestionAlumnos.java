package com.ivanmejia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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

    private ListaAlumnos listaAlumnos;

    public GestionAlumnos() {
        lista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                listaAlumnos = new ListaAlumnos(alumnos);
                name.setText(null);
                lastNames.setText(null);
                telf.setText(null);
                mail.setText(null);

            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean grabado;

                //se eliminan los espacios que hubiese en el texto introducido
                telf.setText(telf.getText().replace(" ", ""));

                String nombre = name.getText().replace(" ", "");
                String apellidos = lastNames.getText().replace(" ", "");
                String email = mail.getText().replace(" ", "");

                //se controla que haya contenido en la variable teléfono
                if (!(telf.getText().equals("")) && (!(nombre.equals(""))) && (!(apellidos.equals(""))) && (!(email.equals("")))) {

                    int telefono = Integer.parseInt(telf.getText());

                    grabado = alumnos.add(new Alumno(name.getText(), lastNames.getText(), telefono, mail.getText()));

                    if (grabado) {
                        JOptionPane.showMessageDialog(null, "OK", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        name.setText(null);
                        lastNames.setText(null);
                        telf.setText(null);
                        mail.setText(null);
                    } else {
                        JOptionPane.showMessageDialog(panel1, "Proceso de guardado fallido.", "¡ATENCIÓN!", JOptionPane.ERROR_MESSAGE);
                        name.setText(null);
                        lastNames.setText(null);
                        telf.setText(null);
                        mail.setText(null);
                    }
                } else {
                    JOptionPane.showMessageDialog(panel1, "Debe introducir datos válidos", "¡ATENCIÓN!", JOptionPane.ERROR_MESSAGE);
                    name.setText(null);
                    lastNames.setText(null);
                    telf.setText(null);
                    mail.setText(null);
                }
            }
        });
        telf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);

                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') ||
                        (caracter > '9')) &&
                        (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
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
