package com.sebastiano.corsobase.metodi;

public class Metodi {

    // <modificatore di visibilitá> <return variable type> <nome> (parameters)
    public int potenzaAlQuadrato(int x) {
        return x*x;
    }

    public void stampa(String testo){
        System.out.println(testo);
    }

    // private methods can not be accessible by other java classes
    private void setA(String testA){
        String A = testA;
    }


}
