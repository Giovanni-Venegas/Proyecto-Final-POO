package com.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel_Uno extends JPanel {
     static JTextField textField;
     static ButtonGroup buttons12;
     static public JButton button1;
     static public JButton button2;
     static public JButton button3;

    static public JLabel etiqueta10;
    static public JLabel etiqueta11;
    static public JLabel etiqueta12;
    static public JLabel etiqueta13;

    static public JLabel etiquetaa;
    static public JLabel etiquetab;
    static public JLabel etiquetac;
    static public JLabel etiquetad;
    static public JLabel etiquetae;
    static public JLabel etiquetaf;
    static public JLabel etiquetag;
    static public JLabel etiquetah;
    static public JLabel etiquetai;
    static public JLabel etiquetaj;
    static public JLabel etiquetak;
    static public JLabel etiquetal;

    static public JLabel etiquetare;





    private Font fuenteLabels = new Font("Segoue UI", Font.PLAIN, 25); //Negrita
    private Font fuenteLabels1 = new Font("Segoue UI", Font.PLAIN, 14); //Negrita
    private Font fuenteLabels2 = new Font("Segoue UI Light", Font.PLAIN, 21); //Negrita

        public Panel_Uno(){
            this.setLayout(null);

            JLabel etiqueta1 = new JLabel(new ImageIcon("barra1.JPG"));
            etiqueta1.setBounds(-300,-70,900,900);
            this.add(etiqueta1);

            JLabel etiqueta2 = new JLabel(new ImageIcon("bar.JPG"));
            etiqueta2.setBounds(-405,-20,900,200);
            this.add(etiqueta2);

            JLabel etiqueta3 = new JLabel(new ImageIcon("pie.JPG"));
            etiqueta3.setBounds(55,-380,900,900);
            this.add(etiqueta3);

            etiquetare = new JLabel(new ImageIcon("relleno.JPG"));
            etiquetare.setBounds(55,50,900,900);
            this.add(etiquetare);




            button1 = new JButton("Cargar Archivo");
            button1.setBounds(100,235,150,20);
            this.add(button1);

             button2 = new JButton("Cargar Base Palabras");
            button2.setBounds(100,350,150,20);
            this.add(button2);

            button3 = new JButton("Graficar");
            button3.setBounds(100,450,150,20);
            this.add(button3);

            buttons12 = new ButtonGroup();
            buttons12.add(button1);
            buttons12.add(button2);
            buttons12.add(button3);

            etiqueta10 = new JLabel("Grafica Vaccination Tweets");
            etiqueta10.setBounds(350,-20,800,100);
            etiqueta10.setFont(fuenteLabels);
            this.add(etiqueta10);

            etiqueta11 = new JLabel();
            etiqueta11.setBounds(350,50,600,100);
            etiqueta11.setFont(fuenteLabels1);
            //etiqueta11.setForeground(Color.WHITE);
            this.add(etiqueta11);

            etiqueta12 = new JLabel();
            etiqueta12.setBounds(350,78,600,100);
            etiqueta12.setFont(fuenteLabels1);
            //etiqueta11.setForeground(Color.WHITE);
            this.add(etiqueta12);

            etiqueta13 = new JLabel("Frecuencia");
            etiqueta13.setBounds(350,140,600,100);
            etiqueta13.setFont(fuenteLabels2);
            //etiqueta11.setForeground(Color.WHITE);
            this.add(etiqueta13);

            etiquetaa = new JLabel();
            etiquetaa.setBounds(350,200,600,100);
            etiquetaa.setFont(fuenteLabels1);
            this.add(etiquetaa);

            etiquetab = new JLabel();
            etiquetab.setBounds(350,240,600,100);
            etiquetab.setFont(fuenteLabels1);
            this.add(etiquetab);

            etiquetac = new JLabel();
            etiquetac.setBounds(350,280,600,100);
            etiquetac.setFont(fuenteLabels1);
            this.add(etiquetac);

            etiquetad = new JLabel();
            etiquetad.setBounds(350,320,600,100);
            etiquetad.setFont(fuenteLabels1);
            this.add(etiquetad);

            etiquetae = new JLabel();
            etiquetae.setBounds(350,360,600,100);
            etiquetae.setFont(fuenteLabels1);
            this.add(etiquetae);

            etiquetaf = new JLabel();
            etiquetaf.setBounds(350,400,600,100);
            etiquetaf.setFont(fuenteLabels1);
            this.add(etiquetaf);

            etiquetag = new JLabel();
            etiquetag.setBounds(350,440,600,100);
            etiquetag.setFont(fuenteLabels1);
            this.add(etiquetag);

            etiquetah = new JLabel();
            etiquetah.setBounds(350,480,600,100);
            etiquetah.setFont(fuenteLabels1);
            this.add(etiquetah);

            etiquetai = new JLabel();
            etiquetai.setBounds(350,520,600,100);
            etiquetai.setFont(fuenteLabels1);
            this.add(etiquetai);

            etiquetaj = new JLabel();
            etiquetaj.setBounds(350,560,600,100);
            etiquetaj.setFont(fuenteLabels1);
            this.add(etiquetaj);

            etiquetak = new JLabel();
            etiquetak.setBounds(350,600,600,100);
            etiquetak.setFont(fuenteLabels1);
            this.add(etiquetak);

            etiquetal = new JLabel();
            etiquetal.setBounds(350,640,600,100);
            etiquetal.setFont(fuenteLabels1);
            this.add(etiquetal);






            /*ActionListener escuchador = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Se cargo el archivo CSV", "mens", JOptionPane.INFORMATION_MESSAGE);
                }
            };

            button1.addActionListener(escuchador);


            ActionListener escuchador2 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Se cargo el archivo txt", "mens", JOptionPane.INFORMATION_MESSAGE);
                }
            };

            button2.addActionListener(escuchador2);*/

        }
}
