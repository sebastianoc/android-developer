package ObjectiveOriented.Interfaccia;

public class Principale {

    public static void main(String args[])
    {
        Aereo aereo = new Aereo(300, 900, 1500);
        aereo.atterra();
        aereo.decolla();

        System.out.println(aereo.getVelocita());

        Auto auto = new Auto(20,40,100);

    }
}
