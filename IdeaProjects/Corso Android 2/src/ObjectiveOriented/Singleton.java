package ObjectiveOriented;

public class Singleton
{
    /*
    Singleton Class in Java
    In object-oriented programming, a singleton class is a class that can have only
    one object (an instance of the class) at a time.

    After first time, if we try to instantiate the Singleton class, the new variable
    also points to the first instance created. So whatever modifications we do to any
    variable inside the class through any instance, it affects the variable of the single
    instance created and is visible if we access that variable through any variable of that class type defined

    1. Make constructor as private.
    2. Write a static method that has return type object of this singleton class. Here,
    the concept of Lazy initialization is used to write this static method.
    */

    private String traccia = "Madness";
    private static Singleton mInstance;

    // Define the constructor private so that it can not be initiated.
    private Singleton() {
        // private constructor

    }

    // This method allows to initiate and get the instance, it is the main method since the constructor is private
    public static Singleton getInstance(){
        if (mInstance == null) {
            mInstance = new Singleton();
        }

        return mInstance;
    }

    public void currentSong(){
        System.out.println(traccia);
    }



}
