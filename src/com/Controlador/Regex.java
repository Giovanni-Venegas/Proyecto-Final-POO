package com.Controlador;

//  Imports
import javax.swing.JOptionPane;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Regex {

    final private String vacio = "";

    // Constructor
    public Regex() {
    }

    /*
     * This Method reads a plain text file/csv from a given path and saves the
     * content of it inside a string
     *
     * @param (String) path: Path from file to read
     *
     * @returns (String []) arregloTemporal: saved Text
     */
    public String[] leerTexto(String path) {
        // Variables
        ArrayList<String> texto = new ArrayList<String>();
        String[] arregloTemporal;

        try {
            Scanner archivo = new Scanner(new File(path));
            //JOptionPane.showMessageDialog(null, "Hola q onda", "mens", JOptionPane.INFORMATION_MESSAGE);
            while (archivo.hasNext()) {
                texto.add(archivo.nextLine());
            }

            archivo.close();
        } catch (FileNotFoundException ex) {
            ex.toString();

            System.out.println("No se encontró el archivo.");
            JOptionPane.showMessageDialog(null, "El archivo .csv no se cargo, intentelo de nuevo ");
            System.exit(404);
        }

        arregloTemporal = texto.toArray(new String[1]);

        for (int i = 0; i < arregloTemporal.length; i++) {
            arregloTemporal[i] = this.limpiarTexto(arregloTemporal[i]);
        }

        return arregloTemporal;
    }

    /*
     * This Method reads a plain text file/csv from a given path and saves the
     * content of it inside a double dimensioned string
     *
     * @param (String) path: Path from file to read
     *
     * @returns (String [][]) keywords: saved words to count
     */
    public String[][] conseguirKeywords(String path) {
        // Variables
        ArrayList<String> texto = new ArrayList<String>();
        String[] arregloTemporal;
        String[][] keywords;

        try {
            Scanner archivo = new Scanner(new File(path));

            while (archivo.hasNext()) {
                texto.add(archivo.nextLine());
            }

            archivo.close();
        } catch (FileNotFoundException ex) {
            ex.toString();
            System.out.println("No se encontró el archivo.");
            JOptionPane.showMessageDialog(null, "El archivo .txt no se cargo, intentelo de nuevo ");
            System.exit(404);
        }

        arregloTemporal = texto.toArray(new String[1]);

        keywords = new String[arregloTemporal.length][2];

        for (int i = 0; i < arregloTemporal.length; i++) {
            keywords[i][0] = arregloTemporal[i];
            keywords[i][1] = "0";
        }

        return keywords;
    }

    /*
     * This Method counts how many times a word from a word dictionary of
     * [keyword][count] appears inside a text given, then it saves it on the count
     * from the same dictionary
     *
     * @param (String []) texto: Text, (String [][]) keywords: words to count
     *
     * @returns (String [][]) keywords: words with number of occurrences
     */
    public String[][] contarKeywords(String[] texto, String[][] keywords) {
        // Variables
        ArrayList<String> textoAContar = new ArrayList<String>();
        ArrayList<String> keywordsAContar = new ArrayList<String>();
        int conteo;

        for (int i = 0; i < texto.length; i++) {
            textoAContar.add(texto[i]);
        }

        for (int i = 0; i < keywords.length; i++) {
            for (int j = 0; j < keywords[i].length; j++) {
                keywordsAContar.add(keywords[i][j]);
            }
        }

        for (int i = 0; i < keywordsAContar.size(); i += 2) {
            conteo = 0;
            for (int j = 0; j < textoAContar.size(); j++) {
                if (textoAContar.get(j).contains(keywordsAContar.get(i))) {
                    conteo++;
                }
            }
            keywords[i / 2][1] = Integer.toString(conteo); // keywordsAContar.set(i + 1, Integer.toString(conteo));
        }

        return keywords;
    }

    /*
     * This Method erases numbers from text
     *
     * @param (String) texto: Text to modify
     *
     * @returns (String) nuevoTexto: Text without numbers
     */
    public String sinNumeros(String texto) {
        String regex = "\\d";
        String nuevoTexto = texto;

        nuevoTexto = nuevoTexto.replaceAll(regex, vacio);

        return nuevoTexto;
    }

    /*
     * This Method erases every character except letters
     *
     * @param (String) texto: Text to modify
     *
     * @returns (String) nuevoTexto: Text with just letters
     */
    public String soloPalabras(String texto) {
        String regex = "[^\\w\\s]";
        String nuevoTexto = texto;

        nuevoTexto = nuevoTexto.replaceAll(regex, vacio);

        return nuevoTexto;
    }

    /*
     * This Method changes all letters to lowercase
     *
     * @param (String) texto: Text to modify
     *
     * @returns (String) nuevoTexto: Text in lower case.
     */
    public String enMinusculas(String texto) {
        String nuevoTexto = texto;

        nuevoTexto = nuevoTexto.toLowerCase();

        return nuevoTexto;
    }

    /*
     * This Method takes out accents from vocals
     *
     * @param (String) texto: Text to modify
     *
     * @returns (String) nuevoTexto: Text without accents
     */
    public String sinAcentos(String texto) {
        String[] regex = { "[á]", "[é]", "[í]", "[ó]", "[ú]" };
        String nuevoTexto = texto;
        String[] vocales = { "a", "e", "i", "o", "u" };

        for (int i = 0; i < regex.length; i++) {
            nuevoTexto = nuevoTexto.replaceAll(regex[i], vocales[i]);
        }

        return nuevoTexto;
    }

    /*
     * This Method erases tabs from the text given
     *
     * @param (String) texto: Text to modify
     *
     * @returns (String) nuevoTexto: Text without tabs
     */
    public String sinTabuladores(String texto) {
        String regex = "[\t]";
        String nuevoTexto = texto;

        nuevoTexto = nuevoTexto.replaceAll(regex, vacio);

        return nuevoTexto;
    }

    /*
     * This Method uses all the text modifying methods from the class, and also gets
     * rid of duplicated spaces
     *
     * @param (String) texto: Text to modify
     *
     * @returns (String) nuevoTexto: Modified Text
     */
    public String limpiarTexto(String texto) {
        String nuevoTexto = texto;

        nuevoTexto = this.sinNumeros(nuevoTexto);
        nuevoTexto = this.sinAcentos(nuevoTexto);
        nuevoTexto = this.soloPalabras(nuevoTexto);
        nuevoTexto = this.enMinusculas(nuevoTexto);
        nuevoTexto = this.sinTabuladores(nuevoTexto);
        while (nuevoTexto.contains("  ")) {
            nuevoTexto = nuevoTexto.replaceAll("  ", " ");
        }

        return nuevoTexto;
    }


}
