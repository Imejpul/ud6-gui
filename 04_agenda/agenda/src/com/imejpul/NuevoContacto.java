package com.imejpul;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NuevoContacto {
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JPanel nuevoContactoPanel;

    public NuevoContacto() {

        JFrame frame = new JFrame("NuevoContacto");
        frame.setContentPane(nuevoContactoPanel);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
