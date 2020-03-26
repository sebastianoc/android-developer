package ObjectiveOriented;

public class AnimaleEreditarietaCane extends AnimaleEreditarieta {

    int altezza;
    String nome;

    // Ogni sottoclasse deve implementare il costruttore della superclasse
    public AnimaleEreditarietaCane(int altezza, String nome){
        super(2, 1, altezza,nome);
        this.altezza = altezza;
        this.nome = nome;

    }

    // This override a method of the superclass
    @Override
    public void corri() {
//        super.corri();
        System.out.println("Corro.. Class: Cane");
    }

//    public void corri(){
//        System.out.println("Corro.. Class: Cane");
//    }
}
