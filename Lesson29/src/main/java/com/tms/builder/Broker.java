package com.tms.builder;

public class Broker {
    private String name;
    private String brokerOwnerName;
    private double value;


    public static final class BrokerBuilder {
        private String name;
        private String brokerOwnerName;
        private double value;

        private BrokerBuilder() {
        }

        public static BrokerBuilder builder() {
            return new BrokerBuilder();
        }

        public BrokerBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public BrokerBuilder withBrokerOwnerName(String brokerOwnerName) {
            this.brokerOwnerName = brokerOwnerName;
            return this;
        }

        public BrokerBuilder withValue(double value) {
            this.value = value;
            return this;
        }

        public Broker build() {
            Broker broker = new Broker();
            broker.value = this.value;
            broker.name = this.name;
            broker.brokerOwnerName = this.brokerOwnerName;
            return broker;
        }
    }
}
