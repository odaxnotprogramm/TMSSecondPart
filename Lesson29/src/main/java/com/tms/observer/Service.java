package com.tms.observer;

import java.util.Observable;
import java.util.Observer;

public class Service extends Observable {
    public void createUser(User user){
        System.out.println("Save user");

        setChanged();
        notifyObservers(user);
    }
}
