package com.tms.observer;

public class MainApp {
    public static void main(String[] args) {
        Service service = new Service();
        service.addObserver(new Security());
        service.addObserver(new Salary());
        service.addObserver(new Admin());

        service.createUser(new User("Danil"));
    }
}
