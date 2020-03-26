package ObjectiveOriented;

public class Persona {
    String nome;
    int anni;
    char sesso;

    // Costruttore
    // Possono essere dichiarati piu costruttori
    // all'interno di una classe
    public Persona(String nomeP, int anniP, char sessoP)
    {
        nome = nomeP;
        anni = anniP;
        sesso = sessoP;
    }

    public Persona()
    {

    }

    public void stampa()
    {
        System.out.println("nome " + nome + " anni " + anni + " sesso " + sesso);
    }
}
