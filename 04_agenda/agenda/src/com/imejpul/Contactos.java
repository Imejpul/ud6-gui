package com.imejpul;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Contactos {
    private JPanel contactosPanel;
    private JButton nextButton;
    private JButton prevButton;
    private JLabel labelNombre;
    private JLabel labelTelefono;
    private JLabel labelEmail;
    private JLabel labelResNom;
    private JLabel labelResTelf;
    private JLabel labelResEmail;
    private JLabel posLabel;

    private int pos = 0;

    private void mostrarContacto(List<Contacto> contactos, int i) {
        labelResNom.setText(contactos.get(i).getNombre());
        labelResTelf.setText(String.valueOf(contactos.get(i).getTelefono()));
        labelResEmail.setText(contactos.get(i).getEmail());
        posLabel.setText((i + 1) + " de " + contactos.size());

    }

    private void comprobarPosicion(List<Contacto> contactos, int direccion) {

        //si la lista está al principio y se pulsa atrás, se va al final
        if (direccion == 0) {
            if (pos == 0) {
                pos = (contactos.size() - 1);
            } else {
                pos--;
            }
            //si la lista está al final y se pulsa adelante, vuelve al principio
        } else if (direccion == 1) {
            if (pos == (contactos.size() - 1)) {
                pos = 0;
            } else {
                pos++;
            }
        }

    }

    public Contactos(Agenda vp) {

        JFrame frame = new JFrame("Contactos");
        frame.setContentPane(contactosPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(vp.getPanelAgenda());
        frame.setVisible(true);

        if (vp.getContactos().size() == 0) {
            labelResNom.setText("");
            labelResTelf.setText("");
            labelResEmail.setText("");
            posLabel.setText("");
        } else {
            mostrarContacto(vp.getContactos(), pos);
        }

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int dir = 0;
                comprobarPosicion(vp.getContactos(), dir);
                mostrarContacto(vp.getContactos(), pos);

            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int dir = 1;
                comprobarPosicion(vp.getContactos(), dir);
                mostrarContacto(vp.getContactos(), pos);

            }
        });
    }
}
