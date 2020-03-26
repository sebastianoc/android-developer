package ObjectiveOriented;

public class SingletonProg {

    public static void main(String args[])
    {
        Singleton.getInstance().currentSong();
        // This doesn't work because the constructor is private!
        // Singleton singleton = new Singleton();
    }

}
