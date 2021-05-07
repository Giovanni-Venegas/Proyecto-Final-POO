/**
 * Proyecto Final de Programacion Orientada a Objetos
 * Pfizer Vaccine Tweets
 *
 * @author: Giovanni Josue Venegas Ramirez (Data Science Specialization and Backend Developer)
 * Package: Prueba
 * File: PruebaFrame
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


package com.prueba;

import com.Controlador.ControladorPInterfaz;
import com.Modelo.Panel_Dos;
import com.Vista.Frame_Uno;

/**
 *
 * Clase principal
 */

public class PruebaFrame {

    public static void main(String[] args) {
	// write your code here
        Frame_Uno frame1 = new Frame_Uno();
        ControladorPInterfaz controlador = new ControladorPInterfaz (frame1);
        frame1.setVisible(true);
    }
}
