package com.tms;

import java.util.Objects;

public class Coin {

    private int ID;
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int coinID) {
        this.ID = coinID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Coin(int ID, String name, double price){
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return ID == coin.ID && Double.compare(coin.price, price) == 0 && Objects.equals(name, coin.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, price);
    }
}
