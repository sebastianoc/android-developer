package com.sebastiano.corsobase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayListArray {

    public static void main(String args[]) {

        // Array
        // [tipo di dato] nome[] = new [tipo di dato][];
        int arrayNumeroInteri[] = new int[]{10,20,30,40,50};  // creazione array
        // tra parentesi (new int[]) va il numero totale di elementi, oppure gli elementi
        // int arrayNumeroInteri[] = new int[]{1,2,3,4,5};
        System.out.println(arrayNumeroInteri[1]);  // il valore 10
        System.out.println(arrayNumeroInteri[4]);  // il valore 50

        int arrayNumeroInteri2[] = new int[6]; // definisco le dimensioni dell'array
        arrayNumeroInteri2[0] = 99;
        arrayNumeroInteri2[4] = 1199;
        System.out.println(arrayNumeroInteri2[0]);  // il valore 99
        System.out.println(arrayNumeroInteri2[4]);  // il valore 1199
        System.out.println(arrayNumeroInteri2[5]);  // il valore 0 perché non é stato inizializzato

        String arrayString[] = new String[]{"hello", "ciao"};

        // ArrayList<tipo di dato>
        List<String> listAlfa = new ArrayList<>();
        // Le liste contengono tipo string
        // Le liste non vanno inizalizzate
        // ArrayList ha molti piú metodi e funzioni
        listAlfa.add("Sara");
        listAlfa.add("Mattia");
        listAlfa.add("Matteo");
        listAlfa.add("Sofia");
        System.out.println(listAlfa.get(0)); // Sara
        System.out.println(listAlfa.get(3)); // Sofia

        // HashMap<key, value>
        // key values pair
        HashMap<String, String> hashBeta = new HashMap<>();
        hashBeta.put("key1","chiave cancello");
        hashBeta.put("key2","chiave ingresso");
        System.out.println(hashBeta.get("key1"));
        // The difference between hashMap and ArrayList is that
        // the ArrayList key is sequential and numeric only
        // hashMap key can be defined.

    }

}
