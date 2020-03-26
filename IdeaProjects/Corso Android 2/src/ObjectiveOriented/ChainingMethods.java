package ObjectiveOriented;

import com.sun.net.httpserver.Filter;

public class ChainingMethods {


    private String traccia = "Madness";
    private static ChainingMethods mInstance;

    // Define the constructor private so that it can not be initiated.
    private ChainingMethods() {
        // private constructor

    }

    // This method allows to initiate and get the instance, it is the main method since the constructor is private
    public static ChainingMethods getInstance(){
        if (mInstance == null) {
            mInstance = new ChainingMethods();
        }

        return mInstance;
    }

    // To set the method chain the method needs to return the object as `this`
    public ChainingMethods setTraccia(String traccia) {
        this.traccia = traccia;

        return this;
    }

    public void currentSong(){
        System.out.println(traccia);
    }
}
