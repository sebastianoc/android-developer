package com.sebastiano.corsobase;

public class Operatori {
    public static void main(String args[]) {

        int a = 5;
        a++;  // ++a;
        a *= 5; // 25
        a--;  // 4

        // le variabili primitive possono essere confrontate con "=="
        // Per comparare oggetti e stringhe non si puó usare "=="

        int b = 4;
        System.out.println(a==b);  // false

        System.out.println(a);

        String s1 = "5";
        String s2 = "5";
        System.out.println(s1==s2);         // SBAGLIATO questa cosa controlla se l'oggetto é identico all'altro. Sbagliato usare ==
        System.out.println(s1.equals(s2));  // CORRETTO
        System.out.println(s1.compareTo(s2));  // CORRETTO

        // && and
        // || or
        // ! not

        int c=4;
        int d=5;
        System.out.println((c == 4) && ( d == 5));
        System.out.println((c != 4) || ( d == 5));

    }
}
