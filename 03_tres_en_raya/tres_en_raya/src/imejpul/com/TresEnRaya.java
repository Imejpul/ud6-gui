package imejpul.com;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TresEnRaya {
    private JPanel panel;
    private JButton boton0_0;
    private JButton boton0_2;
    private JButton boton0_1;
    private JButton boton2_0;
    private JButton boton2_1;
    private JButton boton2_2;
    private JButton boton1_0;
    private JButton boton1_1;
    private JButton boton1_2;

    private int contadorJugadas = 0;
    private int[][] tablero;

    public TresEnRaya() {

        //inicializar tablero

        tablero = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = 0;
            }
        }

        //listeners botones

        boton0_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //comprobar si primera jugada y setear texto botón
                boton0_0.setText(String.valueOf(saberCaracterJugador()));

                //pasar coordenadas boton a tablero
                tablero[0][0] = saberNumeroJugador();

                //comprobar si hay ganador
                jugada(0, 0, saberNumeroJugador());
            }
        });

        boton0_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //comprobar si primera jugada y setear texto botón
                boton0_2.setText(String.valueOf(saberCaracterJugador()));

                //pasar coordenadas boton a tablero
                tablero[0][2] = saberNumeroJugador();

                //comprobar si hay ganador
                jugada(0, 2, saberNumeroJugador());

            }
        });

        boton0_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //comprobar si primera jugada y setear texto botón
                boton0_1.setText(String.valueOf(saberCaracterJugador()));

                //pasar coordenadas boton a tablero
                tablero[0][1] = saberNumeroJugador();

                //comprobar si hay ganador
                jugada(0, 1, saberNumeroJugador());

            }
        });

        boton1_0.addActionListener(e -> {

            //comprobar si primera jugada y setear texto botón
            boton1_0.setText(String.valueOf(saberCaracterJugador()));

            //pasar coordenadas boton a tablero
            tablero[1][0] = saberNumeroJugador();

            //comprobar si hay ganador
            jugada(1, 0, saberNumeroJugador());

        });

        boton1_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //comprobar si primera jugada y setear texto botón
                boton1_1.setText(String.valueOf(saberCaracterJugador()));

                //pasar coordenadas boton a tablero
                tablero[1][1] = saberNumeroJugador();

                //comprobar si hay ganador
                jugada(1, 1, saberNumeroJugador());

            }
        });

        boton1_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //comprobar si primera jugada y setear texto botón
                boton1_2.setText(String.valueOf(saberCaracterJugador()));

                //pasar coordenadas boton a tablero
                tablero[1][2] = saberNumeroJugador();

                //comprobar si hay ganador
                jugada(1, 2, saberNumeroJugador());

            }
        });

        boton2_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //comprobar si primera jugada y setear texto botón
                boton2_0.setText(String.valueOf(saberCaracterJugador()));

                //pasar coordenadas boton a tablero
                tablero[2][0] = saberNumeroJugador();

                //comprobar si hay ganador
                jugada(2, 0, saberNumeroJugador());

            }
        });

        boton2_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //comprobar si primera jugada y setear texto botón
                boton2_1.setText(String.valueOf(saberCaracterJugador()));

                //pasar coordenadas boton a tablero
                tablero[2][1] = saberNumeroJugador();

                //comprobar si hay ganador
                jugada(2, 1, saberNumeroJugador());

            }
        });
        boton2_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //comprobar si primera jugada y setear texto botón
                boton2_2.setText(String.valueOf(saberCaracterJugador()));

                //pasar coordenadas boton a tablero
                tablero[2][2] = saberNumeroJugador();

                //comprobar si hay ganador
                jugada(2, 2, saberNumeroJugador());

            }
        });

    }

    public int hayGanador(int tablero[][]) {

        //Filas

        if (tablero[0][0] == 1 && tablero[0][1] == 1 && tablero[0][2] == 1) {
            return 1;
        }
        if (tablero[0][0] == 2 && tablero[0][1] == 2 && tablero[0][2] == 2) {
            return 2;
        }

        if (tablero[1][0] == 1 && tablero[1][1] == 1 && tablero[1][2] == 1) {
            return 1;
        }
        if (tablero[1][0] == 2 && tablero[1][1] == 2 && tablero[1][2] == 2) {
            return 2;
        }

        if (tablero[2][0] == 1 && tablero[2][1] == 1 && tablero[2][2] == 1) {
            return 1;
        }
        if (tablero[2][0] == 2 && tablero[2][1] == 2 && tablero[2][2] == 2) {
            return 2;
        }

        //Columnas

        if (tablero[0][0] == 1 && tablero[1][0] == 1 && tablero[2][0] == 1) {
            return 1;
        }
        if (tablero[0][0] == 2 && tablero[1][0] == 2 && tablero[2][0] == 2) {
            return 2;
        }

        if (tablero[0][1] == 1 && tablero[1][1] == 1 && tablero[2][1] == 1) {
            return 1;
        }
        if (tablero[0][1] == 2 && tablero[1][1] == 2 && tablero[2][1] == 2) {
            return 2;
        }

        if (tablero[0][2] == 1 && tablero[1][2] == 1 && tablero[2][2] == 1) {
            return 1;
        }
        if (tablero[0][2] == 2 && tablero[1][2] == 2 && tablero[2][2] == 2) {
            return 2;
        }

        //Diagonales

        if (tablero[0][0] == 1 && tablero[1][1] == 1 && tablero[2][2] == 1) {
            return 1;
        }
        if (tablero[0][0] == 2 && tablero[1][1] == 2 && tablero[2][2] == 2) {
            return 2;
        }

        if (tablero[0][2] == 1 && tablero[1][1] == 1 && tablero[2][0] == 1) {
            return 1;
        }
        if (tablero[0][2] == 2 && tablero[1][1] == 2 && tablero[2][0] == 2) {
            return 2;
        }

        return 0;
    }

    public char saberCaracterJugador() {

        //controlar primera jugada
        if (contadorJugadas == 0) {
            return 'O';
        }

        //juagador 1 en tiradas pares
        if (contadorJugadas % 2 == 0) {
            return 'O';
        }

        //jugador2 en tiradas impares
        return 'X';

    }

    public int saberNumeroJugador() {

        //controlar primera jugada
        if (contadorJugadas == 0) {
            return 1;
        }

        //juagador 1 en tiradas pares
        if (contadorJugadas % 2 == 0) {
            return 1;
        }

        //jugador 2 en tiradas impares
        return 2;

    }

    public void jugada(int fila, int columna, int jugador) {

        tablero[fila][columna] = jugador;
        contadorJugadas++;
        int ganador = hayGanador(tablero);

        if (ganador == 1) {
            JOptionPane.showMessageDialog(panel, "GANADOR: Jugador 1", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }

        if (ganador == 2) {
            JOptionPane.showMessageDialog(panel, "GANADOR: Jugador 2", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }

        if (contadorJugadas == 9 && ganador == 0) {
            JOptionPane.showMessageDialog(panel, "¡EMPATE!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tres en raya");
        frame.setContentPane(new TresEnRaya().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
