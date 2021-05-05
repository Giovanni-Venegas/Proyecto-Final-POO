package com.prueba;

import com.Controlador.ControladorPInterfaz;
import com.Modelo.Panel_Dos;
import com.Vista.Frame_Uno;

public class PruebaFrame {

    public static void main(String[] args) {
	// write your code here

        Frame_Uno frame1 = new Frame_Uno();

        ControladorPInterfaz controlador = new ControladorPInterfaz (frame1);


        frame1.setVisible(true);






    }
}
