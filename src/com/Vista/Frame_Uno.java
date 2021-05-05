package com.Vista;

import com.Modelo.Panel_Dos;

import javax.swing.*;
import java.awt.*;

public class Frame_Uno extends JFrame {


static public int a=0;
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

        this.add(espacio_Grafica);


            //this.add(pan2.createDemoPanel());



        setLayout(new GridLayout(1,2));
        setSize(1500,780);
        setResizable(true);


        //this.add(pan2);


    }
}
