package ObjectiveOriented.Interfaccia;

public class Veicolo {
    int velocita;
    int accelerazione;
    int velocitaMassima;

    public Veicolo(int velocita, int accelerazione, int velocitaMassima) {
        this.velocita = velocita;
        this.accelerazione = accelerazione;
        this.velocitaMassima = velocitaMassima;
    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    public int getAccelerazione() {
        return accelerazione;
    }

    public void setAccelerazione(int accelerazione) {
        this.accelerazione = accelerazione;
    }

    public int getVelocitaMassima() {
        return velocitaMassima;
    }

    public void setVelocitaMassima(int velocitaMassima) {
        this.velocitaMassima = velocitaMassima;
    }
}
