/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labfinal_carlosdelarosa_jorgesilva_samueltilano;

import java.awt.Image;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author Dsilv
 */
public class Labfinal_CarlosDeLaRosa_JorgeSilva_SamuelTilano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int regresar;
        int op = 0, opj = 1;
        int flow = 0;
        int giros = 1;
        int LanzamientoBlanca;
        int LanzamientoNegra;
        int colorBlanca = 0;
        int colorNegra = 0;
        int sum;
        float mayorgan;
        float prom1, prom2, prom3;
        float sum1 = 0, sum2 = 0, sum3 = 0;

        Random rango = new Random();
        Scanner leer = new Scanner(System.in);
        ImageIcon mvjicon = new ImageIcon(iconmanager.class.getResource("/Imgs/mvj_icono.png"));
        mvjicon = new ImageIcon(mvjicon.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH));

        ImageIcon error = new ImageIcon(iconmanager.class.getResource("/Imgs/error.jpg"));
        error = new ImageIcon(error.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH));

        ImageIcon working = new ImageIcon(iconmanager.class.getResource("/Imgs/working.jpg"));
        working = new ImageIcon(working.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        ImageIcon adios = new ImageIcon(iconmanager.class.getResource("/Imgs/adios.jpg"));
        adios = new ImageIcon(adios.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        //IMPORTACIÓN DE IMAGENES PARA EL JUEGO DE LA RULETA
        ImageIcon ruleta = new ImageIcon(iconmanager.class.getResource("/Imgs/ruleta.jpg"));
        ruleta = new ImageIcon(ruleta.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH));

        ImageIcon censando = new ImageIcon(iconmanager.class.getResource("/Imgs/censando.jpg"));
        censando = new ImageIcon(censando.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH));

        ImageIcon lanzar = new ImageIcon(iconmanager.class.getResource("/Imgs/lanzar.jpg"));
        lanzar = new ImageIcon(lanzar.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH));

        ImageIcon todascond = new ImageIcon(iconmanager.class.getResource("/Imgs/ctodas.jpg"));
        todascond = new ImageIcon(todascond.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        ImageIcon cond1y2 = new ImageIcon(iconmanager.class.getResource("/Imgs/cond1y2.jpg"));
        cond1y2 = new ImageIcon(cond1y2.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        ImageIcon cond2y3 = new ImageIcon(iconmanager.class.getResource("/Imgs/cond2y3.jpg"));
        cond2y3 = new ImageIcon(cond2y3.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        ImageIcon cond1y3 = new ImageIcon(iconmanager.class.getResource("/Imgs/cond1y3.jpg"));
        cond1y3 = new ImageIcon(cond1y3.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        ImageIcon cond1 = new ImageIcon(iconmanager.class.getResource("/Imgs/cond1.jpg"));
        cond1 = new ImageIcon(cond1.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        ImageIcon cond2 = new ImageIcon(iconmanager.class.getResource("/Imgs/cond2.jpg"));
        cond2 = new ImageIcon(cond2.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        ImageIcon cond3 = new ImageIcon(iconmanager.class.getResource("/Imgs/cond3.jpg"));
        cond3 = new ImageIcon(cond3.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        ImageIcon nogain = new ImageIcon(iconmanager.class.getResource("/Imgs/nogain.jpg"));
        nogain = new ImageIcon(nogain.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        ImageIcon gain1 = new ImageIcon(iconmanager.class.getResource("/Imgs/gain1.jpg"));
        gain1 = new ImageIcon(gain1.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH));

        ImageIcon gain2 = new ImageIcon(iconmanager.class.getResource("/Imgs/gain2.jpg"));
        gain2 = new ImageIcon(gain2.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH));

        ImageIcon gain3 = new ImageIcon(iconmanager.class.getResource("/Imgs/gain3.jpg"));
        gain3 = new ImageIcon(gain3.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH));

        ImageIcon nogainget = new ImageIcon(iconmanager.class.getResource("/Imgs/nogainget.jpg"));
        nogainget = new ImageIcon(nogainget.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH));

        //IMPORTACIÓN DE IMAGENES PARA EL JUEGO DEL TRIQUI.
        ImageIcon triquimenu = new ImageIcon(iconmanager.class.getResource("/Imgs/triquimenu.jpg"));
        triquimenu = new ImageIcon(triquimenu.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH));

        ImageIcon turn1 = new ImageIcon(iconmanager.class.getResource("/Imgs/turn1.jpg"));
        turn1 = new ImageIcon(turn1.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        ImageIcon regresaricon = new ImageIcon(iconmanager.class.getResource("/Imgs/regresar.jpg"));
        regresaricon = new ImageIcon(regresaricon.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        ImageIcon J2 = new ImageIcon(iconmanager.class.getResource("/Imgs/J2.jpg"));
        J2 = new ImageIcon(J2.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        ImageIcon cinvalida = new ImageIcon(iconmanager.class.getResource("/Imgs/cinvalida.jpg"));
        cinvalida = new ImageIcon(cinvalida.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        ImageIcon cocupada = new ImageIcon(iconmanager.class.getResource("/Imgs/cocupada.jpg"));
        cocupada = new ImageIcon(cocupada.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        ImageIcon j1ganador = new ImageIcon(iconmanager.class.getResource("/Imgs/j1ganador.jpg"));
        j1ganador = new ImageIcon(j1ganador.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        ImageIcon j2ganador = new ImageIcon(iconmanager.class.getResource("/Imgs/j2ganador.jpg"));
        j2ganador = new ImageIcon(j2ganador.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        ImageIcon empate = new ImageIcon(iconmanager.class.getResource("/Imgs/empate.jpg"));
        empate = new ImageIcon(empate.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));
        
        ImageIcon regtriqui = new ImageIcon(iconmanager.class.getResource("/Imgs/regtriqui.jpg"));
        regtriqui = new ImageIcon(regtriqui.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));

        JOptionPane.showMessageDialog(null, ""
                + "BIENVENIDO A MATEMÁTICAS VERSÁTILES, JUEGOS Y MÁS.."
                + "\nEste es un programa que combina la diversión de juegos emocionantes, con cálculos matemáticos. "
                + "\nSi te encanta jugar a juegos como la ruleta, Triqui, Bingo o eres más intelectual y te gusta el cálculo, \n"
                + "has instalado el programa adecuado. ",
                "Matemáticas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, mvjicon);
        do {
            do {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "MENÚ\n(1)Juegos 🎰 \n(2)Matemáticas Versatiles ± \n(3)Salír 👋≧◉ᴥ◉≦", "Matemáticas versatíles, juegos y más", JOptionPane.INFORMATION_MESSAGE));
                if (op < 1 || op > 3) {
                    JOptionPane.showMessageDialog(null, "La opción Que ingresaste es invalida... Intentalo nuevamente ", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, error);
                }
                switch (op) {
                    case 1:
                        do {
                            opj = Integer.parseInt(JOptionPane.showInputDialog(null, "MENÚ DE JUEGOS\n(1)RULETA \n(2)TRIQUI \n(3)BINGO \n(4)REGRESAR...", "Matemáticas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE));
                            if (opj < 1 || opj > 4) {
                                JOptionPane.showMessageDialog(null, "La opción Que ingresaste es invalida... Intentalo nuevamente ", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, error);
                            }
                            switch (opj) {

                                //EL JUEGO DE LA RULETA
                                case 1:
                                    JOptionPane.showMessageDialog(null, "Bienvenido a LA RULETA\n"
                                            + "El objetivo principal de este juego es realizar apuestas estratégicas para ganar basándote en las condiciones especificadas.\n"
                                            + "\n"
                                            + "Reglas:\n"
                                            + "La ruleta consta de 24 casillas numeradas del 1 al 24.\n"
                                            + "Las casillas impares son negras, y las casillas pares son blancas.\n"
                                            + "Cada jugada consiste en lanzar dos esferas: una blanca y una negra.\n"
                                            + "Al finalizar tus jugadas, puedes decidir si deseas continuar o retirarte.\n"
                                            + "\n"
                                            + "Las condiciones para ganar son:\n"
                                            + "a. La esfera blanca cae en casilla blanca y la esfera negra cae en casilla negra, y la sumatoria de las casillas es menor o igual a 19 o mayor o igual a 29.\n"
                                            + "b. La esfera blanca cae en casilla blanca y la esfera negra cae en casilla negra, y la sumatoria es mayor o igual a 20 y menor que 29.\n"
                                            + "c. La esfera blanca cae en casilla negra y la esfera negra cae en casilla blanca, y la sumatoria de las casillas es menor o igual a 21.\n"
                                            + "\n"
                                            + "¡Diviértete!", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, ruleta);

                                    while (flow == 0) {
                                        do {
                                            flow = Integer.parseInt(JOptionPane.showInputDialog(null, "PRESIONA (0) PARA LANZAR LAS BOLAS. ", "Matemáticas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE));
                                            if (flow != 0) {
                                                JOptionPane.showMessageDialog(null, "VALOR INGRESADO INVALIDO\n PRESIONA (0) PARA LANZAR LAS BOLAS.", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, error);
                                            }
                                        } while (flow != 0);
                                        JOptionPane.showMessageDialog(null, "", "Censando...", JOptionPane.PLAIN_MESSAGE, censando);
                                        LanzamientoBlanca = rango.nextInt(9) + 1;
                                        LanzamientoNegra = rango.nextInt(9) + 1;
                                        sum = LanzamientoBlanca + LanzamientoNegra;
                                        if (LanzamientoBlanca % 2 == 1) {
                                            colorBlanca = 0;
                                        } else {
                                            colorBlanca = 1;
                                        }
                                        if (LanzamientoNegra % 2 == 1) {
                                            colorNegra = 0;
                                        } else {
                                            colorNegra = 1;
                                        }
                                        if (colorBlanca == 1 & colorNegra == 0 & (sum <= 19 | sum >= 29)) {
                                            JOptionPane.showMessageDialog(null, "Bola blanca, Casilla: " + LanzamientoBlanca + ""
                                                    + "\n Bola Negra, Casilla: " + LanzamientoNegra, "Matemáticas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, gain1);
                                            sum1++;
                                        } else {
                                            if (colorBlanca == 1 & colorNegra == 0 & (sum >= 20 | sum < 29)) {
                                                JOptionPane.showMessageDialog(null, "Bola blanca, Casilla: " + LanzamientoBlanca + ""
                                                        + "\n Bola Negra, Casilla: " + LanzamientoNegra, "Matemáticas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, gain2);
                                                sum2++;
                                            } else {
                                                if (colorBlanca == 0 & colorNegra == 1 & sum <= 21) {
                                                    JOptionPane.showMessageDialog(null, "Bola blanca, Casilla: " + LanzamientoBlanca + ""
                                                            + "\n Bola Negra, Casilla: " + LanzamientoNegra, "Matemáticas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, gain3);
                                                    sum3++;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Bola blanca, Casilla: " + LanzamientoBlanca
                                                            + "\n Bola Negra, Casilla: " + LanzamientoNegra, "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, nogain);
                                                }
                                            }
                                        }
                                        flow = JOptionPane.showConfirmDialog(null, "¿DESEA LANZAR OTRAVÉZ?", "Matemáticas versatíles, juegos y más", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, lanzar);
                                        if (flow == 0) {
                                            giros += 1;
                                        }
                                    }
                                    mayorgan = sum1;
                                    if (sum2 > mayorgan) {
                                        mayorgan = sum2;
                                    } else {
                                        if (sum3 > mayorgan) {
                                            mayorgan = sum3;
                                        }
                                    }
                                    //GANANCIA 1 Y 2
                                    if (mayorgan == 0) {
                                        JOptionPane.showMessageDialog(null, "", "Matemáticas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, nogainget);
                                    } else {
                                        if (mayorgan == sum1 && sum1 == sum2) {
                                            JOptionPane.showMessageDialog(null, "", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, cond1y2);
                                        } else {
                                            //GANANCIA 2 Y 3
                                            if (mayorgan == sum2 && sum2 == sum3) {
                                                JOptionPane.showMessageDialog(null, "", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, cond2y3);
                                            } else {
                                                //GANANCIA 1 Y 3
                                                if (mayorgan == sum3 && sum3 == sum1) {
                                                    JOptionPane.showMessageDialog(null, "", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, cond1y3);
                                                } else {
                                                    //GANANCIA 1
                                                    if (mayorgan == sum1) {
                                                        JOptionPane.showMessageDialog(null, "", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, cond1);
                                                    } else {
                                                        //GANANCIA 2
                                                        if (mayorgan == sum2) {
                                                            JOptionPane.showMessageDialog(null, "", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, cond2);
                                                        } else {
                                                            //GANANCIA 3
                                                            if (mayorgan == sum3) {
                                                                JOptionPane.showMessageDialog(null, "", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, cond3);
                                                            }

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    regresar = JOptionPane.showConfirmDialog(null, "", "Matematicas versatíles, juegos y más", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, regresaricon);
                                    if (regresar == 1) {
                                        opj = 4;
                                        op = 3;
                                    } else {
                                        flow = 0;
                                        giros = 1;
                                        colorBlanca = 0;
                                        colorNegra = 0;
                                        sum1 = 0;
                                        sum2 = 0;
                                        sum3 = 0;
                                    }

                                    break;

                                //EL JUEGO DEL "TRIQUI"
                                case 2:
                                    /*se declaran todos los enteros que usaremos en el programa (triqui)
                                    mov: moviminetos/turnos en total
                                    pos: posicion en la tabla
                                    op: opción, para que el jugador escoja si empezar o no la partida
                                    reg: regresar, para preguntarle al jugador si quiere jugar de nuevo
                                    c1-c9: casillas del juego que son la implementacion detrás de la mostrada al jugador*/
                                    int mov = 1,
                                     pos,
                                     optr = 1,
                                     reg = 1,
                                     c1 = 0,
                                     c2 = 0,
                                     c3 = 0,
                                     c4 = 0,
                                     c5 = 0,
                                     c6 = 0,
                                     c7 = 0,
                                     c8 = 0,
                                     c9 = 0;
                                    /*se declaran las variables de tipo caracter
                                    cm1-cm9: casillas del juego que se mostraran al usuario*/
                                    char cm1 = ' ',
                                     cm2 = ' ',
                                     cm3 = ' ',
                                     cm4 = ' ',
                                     cm5 = ' ',
                                     cm6 = ' ',
                                     cm7 = ' ',
                                     cm8 = ' ',
                                     cm9 = ' ';
                                    /*Ciclo MQ que regula la continuidad del programa, por si el usuario no quiere seguir*/
                                    while (reg == 1) {
                                        /*Se le explica al usuario el funcionamiento del juego*/
                                        JOptionPane.showMessageDialog(null, "¡Bienvenido al emocionante juego de Triqui!\n"
                                                + "\n"
                                                + "El objetivo es ser el primer jugador en colocar tres de sus símbolos (O o X) en línea, ya sea horizontal, vertical o diagonal.\n"
                                                + "\n"
                                                + "El tablero consta de 9 casillas numeradas del 1 al 9. Cada número representa una posición en el tablero.\n"
                                                + "Símbolos de Jugadores:\n"
                                                + "\n"
                                                + "Jugador 1: Círculos (O)\n"
                                                + "Jugador 2: Equis (X)\n"
                                                + "\n"
                                                + "a. El juego comienza con el jugador 1 (O).\n"
                                                + "b. Selecciona la posición donde deseas colocar tu símbolo ingresando el número de la casilla cuando se te indique.\n"
                                                + "c. No se puede sobrescribir una casilla que ya tiene un símbolo.\n"
                                                + "\n"
                                                + "Los jugadores alternan turnos hasta que uno de ellos gane o se llene el tablero.\n"
                                                + "Si el tablero se llena y ningún jugador ha ganado, el juego termina en empate.\n"
                                                + "\n"
                                                + "¡Diviértete!", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, triquimenu);
                                        /*Ciclo MQ que regula continuidad del programa, por si el usuario no quiere empezar otra partida*/
                                        while (optr == 1) {
                                            /*Ciclo Hacer/Hasta(F) (do/while(T)) que se cumple hasta que los movimientos sean mayores que 9*/
                                            do {
                                                /*Condicional que determina el turno, O si es impar*/
                                                if (mov % 2 == 1) {
                                                    /*Se lee informa al jugador el turno (O)*/
                                                    JOptionPane.showMessageDialog(null, "", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, turn1);
                                                    /*Se le pide la posicion a ocupar, mostrando el tablero con las casillas vacias*/
                                                    do {
                                                        pos = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                                "EL TRIQUI"
                                                                + "\n                       " + cm1 + "   | " + cm2 + "    | " + cm3 + "\n"
                                                                + "                    ------------------\n"
                                                                + "                       " + cm4 + "   | " + cm5 + "    | " + cm6 + "\n"
                                                                + "                    ------------------\n"
                                                                + "                       " + cm7 + "   | " + cm8 + "    | " + cm9 + "\n"
                                                                + "\nGUÍA: Ingresa la posicion correpondiente a la casilla.", "Matematicas versatíles, juegos y más", JOptionPane.INFORMATION_MESSAGE));
                                                        if (pos < 1 || pos > 9) {
                                                            JOptionPane.showMessageDialog(null, "", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, cinvalida);
                                                        }
                                                        if ((pos == 1 && c1 != 0) || (pos == 2 && c2 != 0) || (pos == 3 && c3 != 0) || (pos == 4 && c4 != 0) || (pos == 5 && c5 != 0) || (pos == 6 && c6 != 0)
                                                                || (pos == 7 && c7 != 0) || (pos == 8 && c8 != 0) || (pos == 9 && c9 != 0)) {
                                                            JOptionPane.showMessageDialog(null, "", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, cocupada);
                                                        }
                                                        //SE VALIDA QUE EL JUGADOR HALLA INGRESADO UN VALOR DEL TABLERO Y NO ESTE OCUPADO
                                                    } while (pos < 1 || pos > 9 || (pos == 1 && c1 != 0) || (pos == 2 && c2 != 0) || (pos == 3 && c3 != 0) || (pos == 4 && c4 != 0) || (pos == 5 && c5 != 0) || (pos == 6 && c6 != 0)
                                                            || (pos == 7 && c7 != 0) || (pos == 8 && c8 != 0) || (pos == 9 && c9 != 0));
                                                    if (pos == 1) {
                                                        /*Si el jugador 1 escoge la posición 1 para empezar, la variable c1 = 1 (para la implementacion) y la variable c1m= 'o' (para la salida)*/
                                                        c1 = 1;
                                                        cm1 = 'o';
                                                        /*Esta sería la implementación detras de la que se muestra al jugador, pues se toman en cuenta los valores del O (1) y X (2)
                                                        System.out.println(c1 + " | " + c2 + " | " + c3);
                                                        System.out.println("---------");
                                                        System.out.println(c4 + " | " + c5 + " | " + c6);
                                                        System.out.println("---------");
                                                        System.out.println(c7 + " | " + c8 + " | " + c9);
                                                        */
                                                        /*Se le muestra al usuario el tablero despues de ingresar una posicion*/

                                                    }
                                                    if (pos == 2) {
                                                        c2 = 1;
                                                        cm2 = 'o';

                                                    }
                                                    if (pos == 3) {
                                                        c3 = 1;
                                                        cm3 = 'o';

                                                    }
                                                    if (pos == 4) {
                                                        c4 = 1;
                                                        cm4 = 'o';

                                                    }
                                                    if (pos == 5) {
                                                        c5 = 1;
                                                        cm5 = 'o';

                                                    }
                                                    if (pos == 6) {
                                                        c6 = 1;
                                                        cm6 = 'o';

                                                    }
                                                    if (pos == 7) {
                                                        c7 = 1;
                                                        cm7 = 'o';

                                                    }
                                                    if (pos == 8) {
                                                        c8 = 1;
                                                        cm8 = 'o';

                                                    }
                                                    if (pos == 9) {
                                                        c9 = 1;
                                                        cm9 = 'o';

                                                    }
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, J2);
                                                    do {
                                                        pos = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                                "EL TRIQUI"
                                                                + "\n                       " + cm1 + "   | " + cm2 + "    | " + cm3 + "\n"
                                                                + "                    ------------------\n"
                                                                + "                       " + cm4 + "   | " + cm5 + "    | " + cm6 + "\n"
                                                                + "                    ------------------\n"
                                                                + "                       " + cm7 + "   | " + cm8 + "    | " + cm9 + "\n"
                                                                + "\nGUÍA: Ingresa la posicion correpondiente a la casilla.", "Matematicas versatíles, juegos y más", JOptionPane.INFORMATION_MESSAGE));
                                                        if (pos < 1 || pos > 9) {
                                                            JOptionPane.showMessageDialog(null, "", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, cinvalida);
                                                        }
                                                        if ((pos == 1 && c1 != 0) || (pos == 2 && c2 != 0) || (pos == 3 && c3 != 0) || (pos == 4 && c4 != 0) || (pos == 5 && c5 != 0) || (pos == 6 && c6 != 0)
                                                                || (pos == 7 && c7 != 0) || (pos == 8 && c8 != 0) || (pos == 9 && c9 != 0)) {
                                                            JOptionPane.showMessageDialog(null, "", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, cocupada);
                                                        }
                                                        //SE VALIDA QUE EL JUGADOR HALLA INGRESADO UN VALOR DEL TABLERO Y NO ESTE OCUPADO
                                                    } while (pos < 1 || pos > 9 || (pos == 1 && c1 != 0) || (pos == 2 && c2 != 0) || (pos == 3 && c3 != 0) || (pos == 4 && c4 != 0) || (pos == 5 && c5 != 0) || (pos == 6 && c6 != 0)
                                                            || (pos == 7 && c7 != 0) || (pos == 8 && c8 != 0) || (pos == 9 && c9 != 0));
                                                    //SE MUESTRA EL TABLERO SEGÚN LA POSICIÓN SELECCIONADA
                                                    if (pos == 1) {
                                                        c1 = 2;
                                                        cm1 = 'x';

                                                    }
                                                    if (pos == 2) {
                                                        c2 = 2;
                                                        cm2 = 'x';

                                                    }
                                                    if (pos == 3) {
                                                        c3 = 2;
                                                        cm3 = 'x';

                                                    }
                                                    if (pos == 4) {
                                                        c4 = 2;
                                                        cm4 = 'x';

                                                    }
                                                    if (pos == 5) {
                                                        c5 = 2;
                                                        cm5 = 'x';

                                                    }
                                                    if (pos == 6) {
                                                        c6 = 2;
                                                        cm6 = 'x';

                                                    }
                                                    if (pos == 7) {
                                                        c7 = 2;
                                                        cm7 = 'x';

                                                    }
                                                    if (pos == 8) {
                                                        c8 = 2;
                                                        cm8 = 'x';

                                                    }
                                                    if (pos == 9) {
                                                        c9 = 2;
                                                        cm9 = 'x';
                                                    }
                                                }
                                                /*Despues de que el jugador 1 o 2 haya ingresado la posición se le suma un movimiento.*/
                                                mov = mov + 1;
                                                /*Se implementa un condicional para ver si el jugador 1 gana dependiendo de 
                                                en que posisciones podria ganar (si se cumple alguna se declara como ganador)*/
                                                if ((c1 == 1 && c1 == c2 && c2 == c3) || (c4 == 1 && c4 == c5 && c5 == c6) || (c7 == 1 && c7 == c8 && c8 == c9) || (c1 == 1 && c1 == c4 && c4 == c7) || (c2 == 1 && c2 == c5 && c5 == c8) || (c3 == 1 && c3 == c6 && c6 == c9)
                                                        || (c1 == 1 && c1 == c5 && c5 == c9) || (c3 == 1 && c3 == c5 && c5 == c7) || (c7 == 1 && c7 == c8 && c8 == c9)) {
                                                    JOptionPane.showMessageDialog(null, "\n                       " + cm1 + "   | " + cm2 + "    | " + cm3 + "\n"
                                                            + "                    ------------------\n"
                                                            + "                       " + cm4 + "   | " + cm5 + "    | " + cm6 + "\n"
                                                            + "                    ------------------\n"
                                                            + "                       " + cm7 + "   | " + cm8 + "    | " + cm9 + "\n", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, j1ganador);
                                                    /*Al movmiento se le asigna el valor 11 para terminar la partida, ya que hubo un ganador*/
                                                    mov = 11;
                                                }
                                                /*Se implementa un condicional para ver si el jugador 2 gana dependiendo de 
                                                en que posisciones podria ganar (si se cumple alguna se declara como ganador)*/
                                                if ((c1 == 2 && c1 == c2 && c2 == c3) || (c4 == 2 && c4 == c5 && c5 == c6) || (c7 == 2 && c7 == c8 && c8 == c9) || (c1 == 2 && c1 == c4 && c4 == c7) || (c2 == 2 && c2 == c5 && c5 == c8) || (c3 == 2 && c3 == c6 && c6 == c9)
                                                        || (c1 == 2 && c1 == c5 && c5 == c9) || (c3 == 2 && c3 == c5 && c5 == c7) || (c7 == 2 && c7 == c8 && c8 == c9)) {
                                                    JOptionPane.showMessageDialog(null, "\n                       " + cm1 + "   | " + cm2 + "    | " + cm3 + "\n"
                                                            + "                    ------------------\n"
                                                            + "                       " + cm4 + "   | " + cm5 + "    | " + cm6 + "\n"
                                                            + "                    ------------------\n"
                                                            + "                       " + cm7 + "   | " + cm8 + "    | " + cm9 + "\n", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, j2ganador);
                                                    /*Al movmiento se le asigna el valor 11 para terminar la partida, ya que hubo un ganador*/
                                                    mov = 11;
                                                }
                                                /*Se implemente un condicional que determinaría el caso de empate, si los movimientos realizados son mayores o iguales que 10, 
                                                y diferentes de 11 (por que 'mov' ya es 11 para terminar la partida) hay un empate*/
                                                if (mov != 11 && mov >= 10) {
                                                    JOptionPane.showMessageDialog(null, "\n                       " + cm1 + "   | " + cm2 + "    | " + cm3 + "\n"
                                                            + "                    ------------------\n"
                                                            + "                       " + cm4 + "   | " + cm5 + "    | " + cm6 + "\n"
                                                            + "                    ------------------\n"
                                                            + "                       " + cm7 + "   | " + cm8 + "    | " + cm9 + "\n", "Matematicas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, empate);
                                                }
                                                /*Este condicional revisa el valor de mov, si es mayor que 9, es decir si alguien gano, o quedo en empate directamente termina el juego*/
                                                if (mov > 9) {
                                                    optr = 2;
                                                }
                                                /*Este es el 'while' del primer 'do', si se cumple se repetira el ciclo como se menciono anteriormente*/
                                            } while (mov < 9);
                                        }
                                        /*Se le pregunta al usuario si desea regresar al menu anterior*/
                                        do {
                                            reg = JOptionPane.showConfirmDialog(null, "", "Matematicas versatíles, juegos y más", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, regtriqui);
                                        } while (reg > 1 || reg < 0);
                                        //Se reinician las variables en caso de volver a jugar...
                                        if (reg == 1) {
                                            mov = 1;
                                            optr = 1;
                                            reg = 1;
                                            c1 = 0;
                                            c2 = 0;
                                            c3 = 0;
                                            c4 = 0;
                                            c5 = 0;
                                            c6 = 0;
                                            c7 = 0;
                                            c8 = 0;
                                            c9 = 0;
                                            cm1 = ' ';
                                            cm2 = ' ';
                                            cm3 = ' ';
                                            cm4 = ' ';
                                            cm5 = ' ';
                                            cm6 = ' ';
                                            cm7 = ' ';
                                            cm8 = ' ';
                                            cm9 = ' ';
                                        }
                                    }
                                    break;
                                case 3:
                                    
                                    break;
                            }
                        } while (opj != 4);
                        break;
                    case 2:
                        //PROCESOS MATEMATICOS EN CONSTRUCCIÓN
                        JOptionPane.showMessageDialog(null, "", "Matemáticas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, working);
                        break;
                }
            } while (op < 1 || op > 3);

        } while (op != 3);
        JOptionPane.showMessageDialog(null, "", "Matemáticas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, adios);
    }

    private static class iconmanager {

        public iconmanager() {
        }

    }
}
