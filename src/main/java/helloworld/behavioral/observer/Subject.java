package helloworld.behavioral.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author yihua.huang@dianping.com
 */
public class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new LinkedList<>();
    }

    public Subject attach(Observer observer) {
        observers.add(observer);
        return this;
    }

    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
