package imejpul.com;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TresEnRaya {
    private JPanel tablero;
    private JButton boton0_0;
    private JButton boton0_2;
    private JButton boton0_1;
    private JButton boton2_0;
    private JButton boton2_1;
    private JButton boton2_2;
    private JButton boton1_0;
    private JButton boton1_1;
    private JButton boton1_2;

    public TresEnRaya() {
        boton0_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        boton0_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        boton0_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        boton1_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        boton1_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        boton1_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        boton2_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        boton2_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        boton2_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

    public void hayGanador() {

    }

    public void hayEmpate() {
        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tres en raya");
        frame.setContentPane(new TresEnRaya().tablero);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
