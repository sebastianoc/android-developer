package ObjectiveOriented;

public class PersonaProg {

    public static void main(String[] args) {
        Persona persona1 = new Persona("marco", 20, 'M');

        persona1.stampa();

        Persona persona2 = new Persona();

        persona2.stampa();
    }

    // Concetto di incapsulamento
    // Si definisce incapsulamento una parte di codice usata
    // per proteggere le altre parti del prgramma dai cambiamenti che si produrrebbero
    // in esse nel caso che questo funzionamento fosse difettoso
}
