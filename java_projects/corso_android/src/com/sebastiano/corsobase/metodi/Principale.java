package com.sebastiano.corsobase.metodi;

public class Principale {
    public static void main(String[] args) {

        // Create an instance of "Metodi"
        Metodi metodi = new Metodi();
        int dato = metodi.potenzaAlQuadrato(5);  // the 'x:' is shown automatically by the IDE
        System.out.println(dato);

        metodi.stampa("Hello World");
    }
}
