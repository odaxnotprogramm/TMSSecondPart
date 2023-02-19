package com.tms.observer;

import java.util.Observable;
import java.util.Observer;

public class Salary implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        User arg1 = (User) arg;
        System.out.println("This is salary man!!!");
        System.out.println("Prepare salary bill for " + arg1.getName());
    }
}
