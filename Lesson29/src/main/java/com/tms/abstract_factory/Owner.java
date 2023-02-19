package com.tms.abstract_factory;

public class Owner {
    private String name;

    Owner (String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: " + name;
    }
}
