package com.tms.abstract_factory;

public class Investor {
    private String name;
    private double money;

    Investor (String name, double money){
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Investor name: " + name + "\nInvestor money value: " + money;
    }
}
