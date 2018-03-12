package com.imejpul;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private JPanel panelAgenda;
    private JButton nuevoContactoButton;
    private JButton contactosButton;
    private JButton buscarButton;

    private Agenda agenda;

    private List<Contacto> contactos = new ArrayList<>();

    public Agenda() {

        agenda = this;

        nuevoContactoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NuevoContacto nc = new NuevoContacto(agenda);
            }
        });

        contactosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Contactos c = new Contactos(agenda);
            }
        });

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Buscar b = new Buscar(agenda);
            }
        });
    }

    public JPanel getPanelAgenda() {
        return panelAgenda;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("");
        frame.setContentPane(new Agenda().panelAgenda);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
