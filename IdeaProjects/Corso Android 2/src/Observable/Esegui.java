package Observable;

public class Esegui {
    public static void main(String args[])
    {
        FavouriteDress fd = new FavouriteDress();

        // Polymorphism, this is legal because User implements Obj
        Obj ob1 = new User("user1");
        Obj ob2 = new User("user2");
        Obj ob3 = new User("user3");

        // Collegato la classe user alla classe FavouriteDress
        ob1.setObserver(fd);
        ob2.setObserver(fd);
        ob3.setObserver(fd);

        // Abbiamo aggiunto l'utente alla newsletter
        fd.addObserver(ob1);
        fd.addObserver(ob2);
        fd.addObserver(ob3);

        fd.postMessage("Ciao");

        fd.removeObserver(ob2);

        fd.postMessage("Hello");


    }
}
