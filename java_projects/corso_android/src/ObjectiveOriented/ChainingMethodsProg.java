package ObjectiveOriented;

public class ChainingMethodsProg {

    // Method Chaining is the practice of calling different methods in a single
    // line instead of calling different methods with the same object reference separately.

    public static void main(String args[])
    {
        ChainingMethods.getInstance().setTraccia("Adele").currentSong();

        // I can call chaining method of classes that are initializated directly in the code
        new ChainingMethodsDialog().setTitle("Title").setMess("Messaggio");

    }
}
