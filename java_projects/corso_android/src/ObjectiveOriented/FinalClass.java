package ObjectiveOriented;

public class FinalClass {
    public static void main(String args[])
    {
        // final defines a variable just one time
        final int age = 5;

        // I can't change the value of the variable after it has been defined the first time
        // This doesn't work
        // age = 10;
        // It is also called CONSTANT
        // Why? Using final prevents the value of a primitive object from changing or a new
        // object being made and overwriting an existing object.

        // A class can be final and it denied other classes to extend it.

        // A final method can't be overridden in a subclass that extends the method's  class



    }
}
