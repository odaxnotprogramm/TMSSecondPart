package com.tms.factory_method;

import com.tms.builder.Broker;

public class BrokerFactoryImpl implements Factory<Broker>{
    @Override
    public Broker create() {
        Broker broker = Broker.BrokerBuilder.builder()
                .withBrokerOwnerName("Satoshi")
                .withName("Binance")
                .withValue(2000000000)
                .build();

        return broker;
    }
}
