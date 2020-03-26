package Observable;

public class User implements Obj{

    private String name;
    private Observer observer;

    public User(String name) {
        this.name = name;
    }

    // Prendiamo il messaggio da observer e lo stampiamo
    @Override
    public void update() {
        String message = observer.getMessage();
        System.out.println(name + " message:: " + message);

    }

    @Override
    public void setObserver(Observable.Observer observer) {
        this.observer = observer;

    }
}
