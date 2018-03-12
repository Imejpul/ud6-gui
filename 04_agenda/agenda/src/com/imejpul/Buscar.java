package com.imejpul;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buscar {
    private JPanel buscarPanel;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton findButton;
    private JPanel panelOpciones;
    private JPanel panelInfo;
    private JLabel parametrosLabel;
    private JLabel findLabel;
    private JLabel nombreLabel;
    private JLabel telfLabel;
    private JLabel emailLabel;
    private JLabel nomResLabel;
    private JLabel telfResLabel;
    private JLabel emailResLabel;

    public Buscar(Agenda vp) {

        JFrame frame = new JFrame("Buscar");
        frame.setContentPane(buscarPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(vp.getPanelAgenda());
        frame.setVisible(true);

        nomResLabel.setText("");
        telfResLabel.setText("");
        emailResLabel.setText("");

        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //controla por que campo

            }
        });
    }
}
