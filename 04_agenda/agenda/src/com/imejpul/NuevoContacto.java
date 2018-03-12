package com.imejpul;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NuevoContacto {
    private JTextField textFieldTelf;
    private JTextField textFieldEmail;
    private JTextField textFieldNom;
    private JButton saveButton;
    private JButton cancelButton;
    private JPanel nuevoContactoPanel;
    private JLabel emailLabel;
    private JLabel telfLabel;
    private JLabel nomLabel;

    private String nombre;
    private int telefono;
    private String email;

    private void almacenarDatosCampos() {

        nombre = textFieldNom.getText();
        telefono = Integer.parseInt(textFieldTelf.getText());
        email = textFieldEmail.getText();
    }

    private void limpiarCampos() {
        textFieldNom.setText("");
        textFieldTelf.setText("");
        textFieldEmail.setText("");
    }

    public NuevoContacto(Agenda vp) {

        JFrame frame = new JFrame("Nuevo Contacto");
        frame.setContentPane(nuevoContactoPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(vp.getPanelAgenda());
        frame.setVisible(true);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                almacenarDatosCampos();
                vp.getContactos().add(new Contacto(nombre, telefono, email));
                limpiarCampos();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
                frame.dispose();
            }
        });
    }
}
