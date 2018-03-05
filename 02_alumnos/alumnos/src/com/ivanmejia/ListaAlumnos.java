package com.ivanmejia;

import javax.swing.*;
import java.util.List;

public class ListaAlumnos {
    private JPanel panel2;
    private JTextArea textArea1;

    public ListaAlumnos(List<Alumno> alumnos) {
        JFrame frame = new JFrame("ListaAlumnos");
        frame.setContentPane(panel2);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        textArea1.setLineWrap(true);

        int total = 0;

        //recorro la lista de alumnos enseñándola en el JTextArea

        for (Alumno a : alumnos) {
            textArea1.append(a.toString() + "\n");
            total++;
        }

        textArea1.append("\n" + "Total: " + total);

    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(JTextArea textArea1) {
        this.textArea1 = textArea1;
    }

    public static void main(String[] args) {

    }
}
