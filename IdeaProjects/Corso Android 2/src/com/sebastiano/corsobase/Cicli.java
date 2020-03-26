package com.sebastiano.corsobase;

public class Cicli {
    public static void main(String[] args) {

        int array[] = new int[]{1,2,3,4,5,6};
        int leggo;

        for (int i=0; i<array.length; i++)
        {
            leggo = array[i];
            if (leggo == 4) {
                System.out.println("Valore trovato " + i);
            }
        }

        int i = 0;   // default le variabili sono inizializzate a 0
        leggo = array[1];

        while (i<array.length){
            leggo = array[i];
            if (leggo == 2) {
                System.out.println("Valore trovato " + i);
            }
            i++;
        }

        // Do cycle runs first the code block at least one time and then check the condition
        i = 0;
        do {
            leggo = array[i];
            if (leggo == 2) {
                System.out.println("Valore trovato nella posizione " + i);
            }
            i++;
        } while (i<array.length);

        for ( int count = 0;  count < 9;   ) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println( );
    }

}

