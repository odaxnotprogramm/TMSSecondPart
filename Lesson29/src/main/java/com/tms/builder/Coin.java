package com.tms.builder;

public class Coin {
    private double price;
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Coin id: " + id + "\nCoin name: " + name +
                "\nCoin price: " + price;
    }

    public static final class CoinBuilder {
        private double price;
        private int id;
        private String name;

        public static CoinBuilder builder() {
            return new CoinBuilder();
        }

        public CoinBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public CoinBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public CoinBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public Coin build() {
            Coin coin = new Coin();
            coin.id = this.id;
            coin.name = this.name;
            coin.price = this.price;
            return coin;
        }
    }
}
