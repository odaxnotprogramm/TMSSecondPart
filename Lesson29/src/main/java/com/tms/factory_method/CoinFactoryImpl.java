package com.tms.factory_method;

import com.tms.builder.Coin;

public class CoinFactoryImpl implements Factory<Coin> {
    public Coin create (){
        Coin coin = Coin.CoinBuilder.builder()
                .withId(1)
                .withName("BTC")
                .withPrice(24678)
                .build();

        return coin;
    }
}
