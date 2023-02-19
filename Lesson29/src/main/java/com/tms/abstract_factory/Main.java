package com.tms.abstract_factory;

public class Main {
    public static void main(String[] args) {
        MainService service = new MainService();
        service.createCoin(new RichAbstractFactoryImpl());
    }
}
