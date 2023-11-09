/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labfinal_carlosdelarosa_jorgesilva_samueltilano;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dsilv
 */
public class Labfinal_CarlosDeLaRosa_JorgeSilva_SamuelTilano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op, opj;
        
        ImageIcon mvjicon = new ImageIcon(iconmanager.class.getResource("/Imgs/mvj_icono.png"));
        mvjicon = new ImageIcon(mvjicon.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));

        ImageIcon error = new ImageIcon(iconmanager.class.getResource("/Imgs/error.jpg"));
        error = new ImageIcon(error.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));

        ImageIcon working = new ImageIcon(iconmanager.class.getResource("/Imgs/working.jpg"));
        working = new ImageIcon(working.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));

        ImageIcon adios = new ImageIcon(iconmanager.class.getResource("/Imgs/adios.jpg"));
        adios = new ImageIcon(adios.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));

        JOptionPane.showMessageDialog(null, ""
                + "BIENVENIDO A MATEMÁTICAS VERSÁTILES, JUEGOS Y MÁS.."
                + "\nEste es un programa que combina la diversión de juegos emocionantes, con cálculos matemáticos. "
                + "\nSi te encanta jugar a juegos como la ruleta, Triqui, Bingo o eres más intelectual y te gusta el cálculo, \n"
                + "has instalado el programa adecuado. "
                + "\n                                                                              ⊂ ͡• ‿‿ ͡•つ",
                "Matemáticas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, mvjicon);
        do {
            do {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "MENÚ\n(1)Juegos 🎰 \n(2)Matemáticas Versatiles ± \n(3)Salír 👋≧◉ᴥ◉≦", "Matemáticas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE));
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
                            switch(opj){
                                case 1:
                                    
                                    break;
                                case 2:
                                    
                                    break;
                                case 3:
                                    
                                    break;
                            }
                        } while (opj != 4);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "En Construcción... ", "Matemáticas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, working);
                        break;
                }
            } while (op < 1 || op > 3);

        } while (op != 3);
        JOptionPane.showMessageDialog(null, "!!Hasta Pronto!!", "Matemáticas versatíles, juegos y más", JOptionPane.PLAIN_MESSAGE, adios);
    }

    private static class iconmanager {

        public iconmanager() {
        }

    }
}
