/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labfinal_carlosdelarosa_jorgesilva_samueltilano;

import javax.swing.Icon;
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
        //Bienvenida
        JOptionPane.showMessageDialog(null, "<html><p style = \"color: black; font: 30px; padding: 20px; background-color: #80b3FF; border:5px solid #687EFF ;text-align: center\">MATEMÁTICAS VERSATILES, "
                + "JUEGOS Y MÁS</p><br><p style = \" margin: 5px; font-size:20px; padding:20px;text-align: center; \">Bienvenid@ a Matemáticas Versátiles, Juegos Y Más(𝐌𝐕𝐉+), este un programa que combina la diversión<br> "
                + "de juegos emocionantes, con calculos matematicos. Si te encanta jugar a juegos como la ruleta, Triqui, Bingo, "
                + "<br>o eres más intelectual y te gusta el cálculo, has instalado el programa adecuado. <br>⊂ ͡• ‿‿ ͡•つ</p></html>", "MVJ+", JOptionPane.PLAIN_MESSAGE);

        //Menú de opciones
        int op;
        do {
            do {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                        + "<html> <p Style = \" color: Black; font-size: 30px; text-align: center; padding: 10px 400px 10px 400px ;margin:10px 50px 10px 50px ;background-color:#90FFF8; border: 5px solid #90D5FF; \">"
                        + "Menú </p></html>\n"
                        + "<html> <p Style = \" color: Black; font-size: 30px; text-align: center; padding: 10px 200px 10px 200px; margin: 20px 200px 0px 200px ;background-color:#559DFF; solid #90D5FF; \">"
                        + "(1) Juegos 🎲</p></html>\n"
                        + "<html> <p Style = \" color: Black; font-size: 30px; text-align: center; padding: 10px 108px 10px 108px ;margin: 0px 200px 0px 200px; background-color:#559DFF; \">"
                        + "(2) Matemáticas versátiles<br>(̶◉͛‿◉̶)☝</p></html>\n"
                        + "<html><p Style = \" color: Black; Text-align:center; padding: 0px 210px 10px 210px; margin: 0px 240px 20px 240px; background-color:#687EFF; font-size: 20px;\">"
                        + "(3) Salír...</p></html>\n"
                        + "<html><p Style= \" color: Black; text-align: center; padding: 10px 100px 40px 100px; margin: 0px 80px 0px 80px;font-size: 15px;\">"
                        + "GUÍA: Ingresa el numero correspondiente a la opción que deseas seleccionar. (>‿◠)✌ </p></html>", "MVJ+", JOptionPane.PLAIN_MESSAGE));
                if (op < 1 || op > 3) {
                    JOptionPane.showMessageDialog(null, "<html><p style= \" color: Black; font-size: 15px;padding:15px; text-align:center;\"> "
                            + "El numero que ingresaste no es valido, <br>𝐢𝐧𝐭𝐞𝐧𝐭𝐚𝐥𝐨 𝐧𝐮𝐞𝐯𝐚𝐦𝐞𝐧𝐭𝐞....</p></html>", "MVJ+", JOptionPane.PLAIN_MESSAGE, icintenta("/Images/spongebob.png"));
                }
            } while (op < 1 || op > 3);

            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "\n \n ","Prueba", JOptionPane.PLAIN_MESSAGE, iconoburro("/Imgs/burro.jpg",70,70));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "<html><p style = \" color: black; font-size: 30px; padding: 10px; margin:10px; text-align:center; \">En construcción...</p></html> ",
                            "MVJ+", JOptionPane.PLAIN_MESSAGE, iconoconstrucción("/Imgs/working.png"));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "<html><p Style= \" Color: Black; Font-size: 30px; text-align:center; padding: 15px;\">¡Hasta Pronto!</p></html>",
                            "MVJ+", JOptionPane.PLAIN_MESSAGE, icdesp("/Imgs/adios"));
                    break;
            }
        } while (op != 3);
    }

    private static Icon iconoburro(String imgsburrojpg, int width, int height) {
        ImageIcon icon = new ImageIcon(Labfinal_CarlosDeLaRosa_JorgeSilva_SamuelTilano.class.getResource("/Imgs/burro.jpg"));
        icon = new ImageIcon(icon.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
        return icon;
    }

    private static Icon iconoconstrucción(String imgsworkingpng) {
        ImageIcon icon = new ImageIcon(Labfinal_CarlosDeLaRosa_JorgeSilva_SamuelTilano.class.getResource("/Imgs/working.png"));
        icon = new ImageIcon(icon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH));
        return icon;
    }

    private static Icon icdesp(String imgsadios) {
        ImageIcon icon = new ImageIcon(Labfinal_CarlosDeLaRosa_JorgeSilva_SamuelTilano.class.getResource("/Imgs/nice.png"));
        icon = new ImageIcon(icon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH));
        return icon;
    }

    private static Icon icintenta(String imagesspongebobpng) {
        ImageIcon icon = new ImageIcon(Labfinal_CarlosDeLaRosa_JorgeSilva_SamuelTilano.class.getResource("/Imgs/spongebob.png"));
        icon = new ImageIcon(icon.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        return icon;
    }

}
