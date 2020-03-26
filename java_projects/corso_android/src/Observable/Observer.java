package Observable;

// Dichiariamo tutti i metodi che ci permettono di aggiungere/rimuovere utenti dalle liste
public interface Observer {

    void addObserver(Obj obj);

    void removeObserver(Obj obj);

    // notify that something is changed or show the message
    void notifyObserver();

    // take the message
    String getMessage();
}
