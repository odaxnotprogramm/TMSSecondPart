package com.tms.abstract_factory;

public class Blockchain {
    private int blocksValue;
    private String contractName;

    public Blockchain(int blocksValue, String contractName) {
        this.blocksValue = blocksValue;
        this.contractName = contractName;
    }

    @Override
    public String toString() {
        return "Blockchain blocks value: " + blocksValue + "\nBlockchain contract name: " + contractName;
    }
}
