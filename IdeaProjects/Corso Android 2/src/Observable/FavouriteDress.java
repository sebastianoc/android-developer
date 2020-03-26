package Observable;

import java.util.ArrayList;
import java.util.List;

// Ci permette di andare a livello globale per spedire email alle person che voglio aggiornamenti di un prodotto
public class FavouriteDress implements Observer{

    private List<Obj> users;
    private String message;

    public FavouriteDress() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addObserver(Obj obj) {
        if (!users.contains(obj)) {
            this.users.add(obj);
        }

    }

    @Override
    public void removeObserver(Obj obj) {
        if (users.contains(obj)) {
            this.users.remove(obj);
        }

    }

    @Override
    public void notifyObserver() {
        for (Obj o:users) {
            o.update();
        }

    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println(message);
        this.message = message;
        notifyObserver();
    }
}
