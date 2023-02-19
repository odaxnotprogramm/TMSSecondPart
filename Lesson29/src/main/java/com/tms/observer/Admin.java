package com.tms.observer;

import java.util.Observable;
import java.util.Observer;

public class Admin implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        User user = (User) arg;
        System.out.println("This is Admin");
        System.out.println("prepare your computer for" + user.getName());
    }
}
