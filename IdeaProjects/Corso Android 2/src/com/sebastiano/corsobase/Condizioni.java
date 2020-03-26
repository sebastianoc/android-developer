package com.sebastiano.corsobase;

public class Condizioni {
    public static void main(String[] args) {

        int soldi = 20;

        if (soldi >= 10){
            System.out.println("You have more than $ 10");
        } else if ((soldi >= 5) && (soldi <=10)) {
            System.out.println("Money between $ 5 and 10");
        } else {
            System.out.println("Money less than $ 5");
        }

        switch(soldi)
        {
            case 1:
                System.out.println("You have $ 1");
                break;
            case 2:
                System.out.println("You have $ 2");
                break;
            case 3:
                System.out.println("You have $ 3");
                break;
            default:
                System.out.println("You have more than $ 3");
                break;
        }

    }
}
