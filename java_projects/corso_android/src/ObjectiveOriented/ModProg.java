package ObjectiveOriented;

// Program to study on the Visibility
public class ModProg {

//    __difference between public, protected, package-private and private in Java?__
//    __modificatori di visibilitá__
//            ______________________________________________________________
//|           │ Class │ Package │ Subclass │ Subclass │ World  |
//            |           │       │         │(same pkg)│(diff pkg)│        |
//            |───────────┼───────┼─────────┼──────────┼──────────┼────────|
//            |public     │   +   │    +    │    +     │     +    │   +    |
//            |───────────┼───────┼─────────┼──────────┼──────────┼────────|
//            |protected  │   +   │    +    │    +     │     +    │        |
//            |───────────┼───────┼─────────┼──────────┼──────────┼────────|
//            |no modifier│   +   │    +    │    +     │          │        |
//            |───────────┼───────┼─────────┼──────────┼──────────┼────────|
//            |private    │   +   │         │          │          │        |
//            |___________|_______|_________|__________|__________|________|
//            + : accessible         blank : not accessible
//
//    private hides from other classes within the package. public exposes to classes outside the package.
//    protected is a version of public restricted only to subclasses


    public static void main(String args[])
    {
        ModificatoriDiVisibilita mod = new ModificatoriDiVisibilita();

        // In questo caso la classe non mostra metodi e variabili `private`
        // mod.stampa e mod.cognome non sono accessibili al di fuori della classe ModificatioriDiVisiblitá
        mod.getCognome();

        mod.stampaMes();

        // A protected variable is visible here because the two classes are in the same packagetr
        System.out.println(mod.secondoNome);

    }
}
