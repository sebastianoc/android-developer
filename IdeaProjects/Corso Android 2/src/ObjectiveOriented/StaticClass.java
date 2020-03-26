package ObjectiveOriented;

// Classe per lo studio di metodi Static e Final
// To use the class ModProg too
public class StaticClass {

    private static int counter = 0;

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public  StaticClass()
    {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
