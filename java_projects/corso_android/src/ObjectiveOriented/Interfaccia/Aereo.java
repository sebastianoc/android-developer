package ObjectiveOriented.Interfaccia;

public class Aereo extends Veicolo implements Volante{

    // Classi ed interfacce per poter dialogare, devono firmare una specie di contratto
    // il contratto impone che tutti i metodi della classe siano implementati nell'interfaccia
    public Aereo(int velocita, int accelerazione, int velocitaMassima) {
        super(velocita, accelerazione, velocitaMassima);
    }

    @Override
    public void decolla() {
        System.out.println("decolla");
    }

    @Override
    public void atterra() {
        System.out.println("atterra");
    }
}
