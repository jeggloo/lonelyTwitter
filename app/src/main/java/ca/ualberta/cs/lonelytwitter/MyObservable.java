package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jloo on 3/10/16.
 */
public interface MyObservable {
    public void registerObserver(MyObserver o);
    public void notifyObservers();
}
