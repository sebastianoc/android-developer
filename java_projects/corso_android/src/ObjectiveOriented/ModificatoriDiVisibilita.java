package ObjectiveOriented;

public class ModificatoriDiVisibilita
{
    public String nome;
    private String cognome;
    protected String secondoNome;

    private void stampa(String mes)
    {
        System.out.println(mes);
    }

    public void stampaMes()
    {
        System.out.println("Sei nella classe modificatori");
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}
