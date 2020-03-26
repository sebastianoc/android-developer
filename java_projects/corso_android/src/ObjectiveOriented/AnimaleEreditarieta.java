package ObjectiveOriented;

public class AnimaleEreditarieta {


    int occhi;
    int bocca;
    int altezza;
    String nome;

    public AnimaleEreditarieta(int occhi, int bocca, int altezza, String nome) {
        this.occhi = occhi;
        this.bocca = bocca;
        this.altezza = altezza;
        this.nome = nome;
    }

    public void corri() {
        System.out.println("Corro.. Class: Animale");
    }

    public void parla(){
        System.out.println("Parlo.. Class: Animale");
    }
}
