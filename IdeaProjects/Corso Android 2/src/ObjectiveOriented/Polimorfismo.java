package ObjectiveOriented;

import java.util.ArrayList;
import java.util.List;

// https://www.html.it/pag/51817/polimorfismo-in-java/
//Polimorfismo 1.
// Ad hoc polymorphism, overload dei metodi, detta più comunemente “method overloading” é
// quando un metodo con lo stesso nome viene creato piú volte con diversi parametri.
public class Polimorfismo
{
    public void inizializzaPersona(String nome)
    {

    }
    public void inizializzaPersona(String nome, int eta)
    {

    }
    public void inizializzaPersona(String nome, int eta, char sesso)
    {

    }
    public void inizializzaPersona()
    {

    }

//    Polimorfismo 2.
//    Ridefinire i metodi ereditati (override o “Inclusion polymorphism”)
//    A differenza del polimorfismo ‘ad hoc’ questa forma di polimorfismo
//    è strettamente legata al concetto di ereditarietà e di sub-typing e
//    consiste nella possibilità che una sottoclasse A di una data classe B
//    ridefinisca uno dei metodi della super-classe e che quindi quando verrà
//    utilizzata una istanza della classe A le invocazioni al metodo ridefinito
//    (spesso detto overridden) eseguiranno il codice definito nella sotto-classe.

    // Come esempio si pensi ad Cane che overridden i metodi di Animale tipo method "corri"


}
