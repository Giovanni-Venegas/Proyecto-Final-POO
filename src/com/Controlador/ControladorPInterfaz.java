/**
* Proyecto Final de Programacion Orientada a Objetos
 * Pfizer Vaccine Tweets
 *
 * @author: Giovanni Josue Venegas Ramirez (Data Science Specialization and Backend Developer)
 * Package: Controlador
 * File: ControladorPInterfaz
 * Date: 11/Mayo/2020
 *
 * Equipo 2:
 * @ Giovanna Ruiz Fermoso  ------> Proyecto Escrito
 * @ Abigail Uribe Gonzales ------> Proyecto Escrito
 * @ Giovanni Josue Venegas Ramirez -----> Developer Principal
 *
 * IDE en uso: Intellij Idea
 *
 * Licencia Oracle: Java SE Runtime Environment 8u291
 *
 * Licencias de codigo abierto:
 *  jFreechart-1.0.19
 *  jCommon-1.0.23
 *
 *  S.O en donde se desarrollo: Windows 10 Version 20H2 2020
 *
 */



package com.Controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Scanner;
import com.Modelo.Panel_Dos;
import com.Vista.Frame_Uno;
import com.Vista.Panel_Uno;
import javax.swing.*;


/**
 *  Usado para escuchar las peticiones del usuario, mediante JButtons
 *  Implementa ActionListener
 */
public class ControladorPInterfaz implements ActionListener {


    Frame_Uno vistaFrame;

    /**
     *
     * @param vistaFrame
     *
     * Funcion usada para añadir los botones que se desean escuchar
     */
    public ControladorPInterfaz(Frame_Uno vistaFrame) {
             this.vistaFrame = vistaFrame;
             Panel_Uno.button1.addActionListener(this);
            Panel_Uno.button2.addActionListener(this);
            Panel_Uno.button3.addActionListener(this);
            Panel_Uno.button4.addActionListener(this);
         }


    /**
     *
     * @param evento
     *
     * Funcion usada para realizar una accion especifica por cada Jbutton
     */
    public void actionPerformed(ActionEvent evento) {

        /**
         * button1--> Cargara el archivo .csv
         */

        if (evento.getSource() == Panel_Uno.button1) {

            try {
                Regex limpiador = new Regex(); // Class upon use
                Scanner input = new Scanner(System.in);
                final String pathTexto; // Path from text File
                final String pathPalabrasImportantes;// Path from Words to count
                String[] texto; // Text file saved into an string
                String[][] keywords; // Words to read from file
                final String[][] keywordCount; // An array with the words and quantity of them

                // System.out.print("Path y nombre del archivo con el texto a limpiar: ");
                // pathTexto = input.nextLine();
                pathTexto=JOptionPane.showInputDialog("Digite la ruta del archivo .csv:");
                System.out.println(pathTexto);

                texto = limpiador.leerTexto(pathTexto);
                System.out.println("El archivo .csv se ha cargado con exito");
                JOptionPane.showMessageDialog(null, "El archivo .csv se ha cargado con exito", "Mensaje de Alerta ", JOptionPane.INFORMATION_MESSAGE);
                Panel_Uno.etiqueta11.setText("Se ha cargado el archivo: Vaccination_tweets.csv");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se cargo el archivo, intentelo de nuevo... ");
            }
        }

        /**
         * button2--> Cargara el archivo .txt
         */

        if (evento.getSource() == Panel_Uno.button2) {
            try {
                Regex limpiador = new Regex(); // Class upon use
                Scanner input = new Scanner(System.in);
                final String pathTexto; // Path from text File
                final String pathPalabrasImportantes;// Path from Words to count
                String[] texto; // Text file saved into an string
                String[][] keywords; // Words to read from file
                final String[][] keywordCount; // An array with the words and quantity of them

                pathTexto = "/Users/VENEGASRAMIREZGIOVAN/Desktop/Vaccination_tweets.csv";
                texto = limpiador.leerTexto(pathTexto);


                //System.out.print("Path y nombre del archivo con las palabras a contar: ");
               // pathPalabrasImportantes = input.nextLine();

                pathPalabrasImportantes= JOptionPane.showInputDialog("Digite la ruta del archivo .txt:");
                System.out.println(pathPalabrasImportantes);
                keywords = limpiador.conseguirKeywords(pathPalabrasImportantes);
                input.close();
                System.out.println("El archivo .txt se ha cargado con exito");
                JOptionPane.showMessageDialog(null, "El archivo .txt se ha cargado con exito", "Mensaje de Alerta ", JOptionPane.INFORMATION_MESSAGE);
                Panel_Uno.etiqueta12.setText("Se ha cargado el archivo: palabras.txt");

                /* Save how many keywords are in the text, in the format of [word][quantity] */
                keywordCount = limpiador.contarKeywords(texto, keywords);

                /* Showing which words and how many of them are in the text */
                for (int i = 0; i < keywordCount.length; i++) {
                    for (int j = 0; j < keywordCount[i].length; j++) {
                        if (j % 2 == 0) {
                            System.out.print("Se encontró la palabra: " + keywordCount[i][j] + " ");
                            //Panel_Uno.etiqueta10.setText("Se encontró la palabra: " + keywordCount[1][0] + " ");
                        } else {
                            System.out.print(keywordCount[i][j] + " veces.\n");
                            //Panel_Uno.etiqueta10.setText(keywordCount[1][0] + " veces.\n");
                        }
                    } // for j
                } // for u

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se cargo el archivo, intentelo de nuevo... ");
                System.out.println("Se generó un error");
            }
        }

        /**
         * button3--> Cargara la gráfica
         */
        if (evento.getSource() == Panel_Uno.button3) {
            if ("Se ha cargado el archivo: Vaccination_tweets.csv".equals(Panel_Uno.etiqueta11.getText()) && "Se ha cargado el archivo: palabras.txt".equals(Panel_Uno.etiqueta12.getText()) ) {
                try {
                    System.out.println("Se generó un errorttt");
                    Panel_Uno.etiquetare.setIcon(null);
                    Panel_Dos pan2 = new Panel_Dos("Ejemplo", 10, 15);

                    Frame_Uno.espacio_Grafica.add(pan2.createDemoPanel());


                } catch (Exception e) {
                    JOptionPane.showConfirmDialog(null, "Sólo números", "Error entrada", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Se generó un error");
                }
            }else{
                JOptionPane.showMessageDialog(null, "No se han cargado los archivos, carguelos e intente de nuevo... ");
            }

        }

        /**
         * button4--> Limpia el Buffer
         */
        if (evento.getSource() == Panel_Uno.button4) {

                try {

                    Panel_Uno.etiqueta11.setText("");
                    Panel_Uno.etiqueta12.setText("");
                    Frame_Uno.espacio_Grafica.removeAll();
                    Frame_Uno.espacio_Grafica.repaint();
                    Panel_Uno.etiquetaa.setText("");
                    Panel_Uno.etiquetab.setText("");
                    Panel_Uno.etiquetac.setText("");
                    Panel_Uno.etiquetad.setText("");
                    Panel_Uno.etiquetae.setText("");
                    Panel_Uno.etiquetaf.setText("");
                    Panel_Uno.etiquetag.setText("");
                    Panel_Uno.etiquetah.setText("");
                    Panel_Uno.etiquetai.setText("");
                    Panel_Uno.etiquetaj.setText("");
                    Panel_Uno.etiquetak.setText("");
                    Panel_Uno.etiquetal.setText("");
                    JOptionPane.showMessageDialog(null, "Buffer limpiado con exito");

                } catch (Exception e) {
                    JOptionPane.showConfirmDialog(null, "Sólo números", "Error entrada", JOptionPane.ERROR_MESSAGE);

                }
        }
    }

}

//  /Users/VENEGASRAMIREZGIOVAN/Desktop/Vaccination_tweets.csv
//  /Users/VENEGASRAMIREZGIOVAN/Desktop/palabras.txt



