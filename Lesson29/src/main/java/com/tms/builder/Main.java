package com.tms.builder;

public class Main {
    public static void main(String[] args) {
        Coin coin = Coin.CoinBuilder.builder()
                .withId(1)
                .withName("BTC")
                .withPrice(24678)
                .build();

        System.out.println(coin.toString());
    }
}
