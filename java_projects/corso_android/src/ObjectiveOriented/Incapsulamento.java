package ObjectiveOriented;

public class Incapsulamento {
    public String name;
    public int eta;


    //    Encapsulation in Java is a mechanism of wrapping the data (variables) and
    //    code acting on the data (methods) together as a single unit. ... Declare
    //    the variables of a class as private. Provide public setter and getter methods
    //    to modify and view the variables values.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {

        if (eta > 18) {
            this.eta = eta;
            System.out.println("Hai la maggior eta per giocare");
        } else {
            System.out.println("Sei troppo piccolo per giocare");
        }
    }

    // Creata sottoclasse della classe Incapsulamento
    private static class Esegui {
        public static void main(String[] args) {
            Incapsulamento inc = new Incapsulamento();

            inc.setEta(100);
            inc.setName("David");

            System.out.println(inc.getEta());
        }
    }
}
