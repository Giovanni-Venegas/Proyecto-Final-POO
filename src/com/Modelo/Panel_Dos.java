/**
 * Proyecto Final de Programacion Orientada a Objetos
 * Pfizer Vaccine Tweets
 *
 * @author: Giovanni Josue Venegas Ramirez (Data Science Specialization and Backend Developer)
 * Package: Modelo
 * File: Panel_Dos
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



package com.Modelo;

//Imports

import javax.swing.*;
import com.Controlador.ControladorPInterfaz;
import com.Controlador.Regex;
import com.Vista.Panel_Uno;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import java.util.Scanner;

/**
 *  Extends ApplicationFrame
 *  Una clase base para crear el marco principal para aplicaciones sencillas. El marco escucha los eventos de cierre de ventanas y responde cerrando la JVM.
 */

public class Panel_Dos extends ApplicationFrame {


  static public int a;

    private static final long serialVersionUID = 1L;
    static int numSi = 0;
    static int numNo = 0;

    /**
     *
     * @param applicationTitle ----> Titulo de la grafica
     * @param numSi
     * @param numNo
     *
     * Función de Construccion
     */

    public Panel_Dos(String applicationTitle, int numSi, int numNo) {

        super(applicationTitle);
        Panel_Dos.numSi = numSi;
        Panel_Dos.numNo = numNo;

        JPanel content = createDemoPanel();
        content.setPreferredSize(new java.awt.Dimension(700,1000));
        getContentPane().add(content);

    }//constructor


    /**
     *
     * @return Valores y datos de la grafica
     */
    private static DefaultCategoryDataset createDataset() {


        DefaultCategoryDataset result = new DefaultCategoryDataset();

        Regex limpiador = new Regex(); // Class upon use
        Scanner input = new Scanner(System.in);
        final String pathTexto; // Path from text File
        final String pathPalabrasImportantes;// Path from Words to count
        String[] texto; // Text file saved into an string
        String[][] keywords; // Words to read from file
        final String[][] keywordCount; // An array with the words and quantity of them


        pathTexto = "/Users/VENEGASRAMIREZGIOVAN/Desktop/vaccination_tweets.csv";

        texto = limpiador.leerTexto(pathTexto);

        pathPalabrasImportantes = "/Users/VENEGASRAMIREZGIOVAN/Desktop/palabras.txt";
        keywords = limpiador.conseguirKeywords(pathPalabrasImportantes);

        /* Save how many keywords are in the text, in the format of [word][quantity] */
        keywordCount = limpiador.contarKeywords(texto, keywords);

        for (int i = 0; i < keywordCount.length; i++) {
            for (int j = 0; j < keywordCount[i].length; j++) {
                if (j % 2 == 0) {

                    //System.out.print("Se encontró la palabra: " + keywordCount[i][j] + " ");
                } else {
                     int a = Integer.parseInt(keywordCount[0][1]);
                     result.setValue(a, "A", "Happy");
                    Panel_Uno.etiquetaa.setText("Se encontro la palabra Happy -> "+a+" veces");

                     int b = Integer.parseInt(keywordCount[1][1]);
                     result.setValue(b, "B", "Fight");
                    Panel_Uno.etiquetab.setText("Se encontro la palabra Fight -> "+b+" veces");

                    int c = Integer.parseInt(keywordCount[2][1]);
                    result.setValue(c, "C", "Pfizer");
                    Panel_Uno.etiquetac.setText("Se encontro la palabra Pfizer -> "+c+" veces");

                    int d = Integer.parseInt(keywordCount[3][1]);
                    result.setValue(d, "D", "Vaccine");
                    Panel_Uno.etiquetad.setText("Se encontro la palabra Vaccine -> "+d+" veces");

                    int e = Integer.parseInt(keywordCount[4][1]);
                    result.setValue(e, "E", "effective");
                    Panel_Uno.etiquetae.setText("Se encontro la palabra effective -> "+e+" veces");

                    int f = Integer.parseInt(keywordCount[5][1]);
                    result.setValue(f, "F", "safe");
                    Panel_Uno.etiquetaf.setText("Se encontro la palabra safe -> "+f+" veces");

                    int g = Integer.parseInt(keywordCount[6][1]);
                    result.setValue(g, "G", "pfizerbiontech");
                    Panel_Uno.etiquetag.setText("Se encontro la palabra pfizerbiontech -> "+g+" veces");

                    int h = Integer.parseInt(keywordCount[7][1]);
                    result.setValue(h, "H", "covid");
                    Panel_Uno.etiquetah.setText("Se encontro la palabra covid-> "+h+" veces");

                    int i1 = Integer.parseInt(keywordCount[8][1]);
                    result.setValue(i1, "I", "healthcare");
                    Panel_Uno.etiquetai.setText("Se encontro la palabra healthcare -> "+i1+" veces");

                    int j1 = Integer.parseInt(keywordCount[9][1]);
                    result.setValue(j1, "J", "eu");
                    Panel_Uno.etiquetaj.setText("Se encontro la palabra eu -> "+j1+" veces");

                    int k = Integer.parseInt(keywordCount[10][1]);
                    result.setValue(k, "K", "conspiracy");
                    Panel_Uno.etiquetak.setText("Se encontro la palabra conspiracy -> "+k+" veces");

                    int l = Integer.parseInt(keywordCount[11][1]);
                    result.setValue(l, "L", "bad");
                    Panel_Uno.etiquetal.setText("Se encontro la palabra bad -> "+l+" veces");

                    //System.out.print(keywordCount[i][j] + " veces.\n");
                   // return result;
                }
            } // for j
        } // for u

       /* DefaultCategoryDataset result = new DefaultCategoryDataset();

        result.setValue(numSi, "A", "Happy");
        result.setValue(numNo, "B", "Fight");
        result.setValue(134, "C", "Pfizer");
        result.setValue(239, "D", "Vaccine");
        result.setValue(369, "E", "effective");
        result.setValue(369, "F", "safe");
        result.setValue(369, "G", "pfizerbiontech");
        result.setValue(369, "H", "covid");
        result.setValue(369, "I", "healthcare");
        result.setValue(369, "J", "eu");
        result.setValue(369, "K", "conspiracy");
        result.setValue(369, "L", "bad");*/

        return result;

    }//DefaultCategoryDataSet


    /**
     *
     * @return ChartPanel
     *
     * Funcion que crea la grafica
     *
     */
    public static JPanel createDemoPanel() {

            JFreeChart chart = ChartFactory.createBarChart3D("Vaccination Tweets", "Palabras en Tweets", "Frecuencia", createDataset(), PlotOrientation.VERTICAL, true, true, false);
            CategoryPlot plot = (CategoryPlot) chart.getPlot();
            CategoryAxis xAxis = (CategoryAxis) plot.getDomainAxis();
            xAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
            plot.setBackgroundAlpha(0.5f);

            ChartPanel chartPanel = new ChartPanel(chart);

            return chartPanel;

    }//createDemoPanel


}
