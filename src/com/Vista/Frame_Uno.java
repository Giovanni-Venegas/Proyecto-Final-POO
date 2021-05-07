/**
 * Proyecto Final de Programacion Orientada a Objetos
 * Pfizer Vaccine Tweets
 *
 * @author: Giovanni Josue Venegas Ramirez (Data Science Specialization and Backend Developer)
 * Package: Vista
 * File: Frame_Uno
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

package com.Vista;

import com.Modelo.Panel_Dos;
import javax.swing.*;
import java.awt.*;

/**
 *
 * Crea la interfaz principal
 *
 */

public class Frame_Uno extends JFrame {

public static JPanel espacio_Grafica;
    public Frame_Uno(){


        super ("Frame Introduccion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setResizable(false);
        setSize(1100,450);
        Panel_Uno pan1 = new Panel_Uno();
        pan1.setBackground(Color.WHITE);
        this.add(pan1);
            Panel_Dos pan2 = new Panel_Dos("Ejemplo", 10, 15);
            //pan2.setBounds(450,20,500,100);
        espacio_Grafica=new JPanel();
        espacio_Grafica.setBackground(Color.WHITE);
        this.add(espacio_Grafica);
            //this.add(pan2.createDemoPanel());
        setLayout(new GridLayout(1,2));
        setSize(1500,780);
        setResizable(true);
        //this.add(pan2);
    }
}
