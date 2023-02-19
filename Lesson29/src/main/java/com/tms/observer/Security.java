package com.tms.observer;

import java.util.Observable;
import java.util.Observer;

public class Security implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        User arg1 = (User) arg;
        System.out.println("This is security man!!!");
        System.out.println("Prepare id card for " + arg1.getName());
    }
}
