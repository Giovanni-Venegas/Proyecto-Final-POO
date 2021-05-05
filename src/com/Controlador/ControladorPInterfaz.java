package com.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Scanner;

import com.Modelo.Panel_Dos;
import com.Vista.Frame_Uno;
import com.Vista.Panel_Uno;

import javax.swing.*;

public class ControladorPInterfaz implements ActionListener {




    Frame_Uno vistaFrame;

        public ControladorPInterfaz(Frame_Uno vistaFrame) {
             this.vistaFrame = vistaFrame;
             Panel_Uno.button1.addActionListener(this);
            Panel_Uno.button2.addActionListener(this);
            Panel_Uno.button3.addActionListener(this);

         }



    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == Panel_Uno.button1) {
            try {
                Regex limpiador = new Regex(); // Class upon use
                Scanner input = new Scanner(System.in);
                final String pathTexto; // Path from text File
                final String pathPalabrasImportantes;// Path from Words to count
                String[] texto; // Text file saved into an string
                String[][] keywords; // Words to read from file
                final String[][] keywordCount; // An array with the words and quantity of them

                System.out.print("Path y nombre del archivo con el texto a limpiar: ");
                pathTexto = input.nextLine();
                texto = limpiador.leerTexto(pathTexto);

                System.out.println("El archivo .csv se ha cargado con exito");
                JOptionPane.showMessageDialog(null, "El archivo .csv se ha cargado con exito", "Mensaje de Alerta ", JOptionPane.INFORMATION_MESSAGE);
                Panel_Uno.etiqueta11.setText("Se ha cargado el archivo: Vaccination_tweets.csv");


            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "El archivo .csv no se cargo con exito, intentelo de nuevo.", "Error entrada", JOptionPane.ERROR_MESSAGE);
                System.out.println("Se generó un error");
            }

        }


        if (evento.getSource() == Panel_Uno.button2) {
            try {
                Regex limpiador = new Regex(); // Class upon use
                Scanner input = new Scanner(System.in);
                final String pathTexto; // Path from text File
                final String pathPalabrasImportantes;// Path from Words to count
                String[] texto; // Text file saved into an string
                String[][] keywords; // Words to read from file
                final String[][] keywordCount; // An array with the words and quantity of them

                pathTexto = "/Users/VENEGASRAMIREZGIOVAN/Desktop/vaccination_tweets.csv";
                texto = limpiador.leerTexto(pathTexto);

                System.out.print("Path y nombre del archivo con las palabras a contar: ");
                pathPalabrasImportantes = input.nextLine();
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
                JOptionPane.showConfirmDialog(null, "Sólo números", "Error entrada", JOptionPane.ERROR_MESSAGE);
                System.out.println("Se generó un error");
            }

        }


        if (evento.getSource() == Panel_Uno.button3) {
            try {
                System.out.println("Se generó un errorttt");
                Panel_Uno.etiquetare.setIcon(null);
                Panel_Dos pan2 = new Panel_Dos("Ejemplo", 10, 15);

                Frame_Uno.espacio_Grafica.add(pan2.createDemoPanel());



            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Sólo números", "Error entrada", JOptionPane.ERROR_MESSAGE);
                System.out.println("Se generó un error");
            }

        }
    }

}

//  /Users/VENEGASRAMIREZGIOVAN/Desktop/vaccination_tweets.csv
//  /Users/VENEGASRAMIREZGIOVAN/Desktop/palabras.txt



