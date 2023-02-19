package com.tms.abstract_factory;

public class TronBlockchainServiceImpl implements BlockchainService{
    @Override
    public Blockchain create() {
        return new Blockchain(3451629,"TRC");
    }
}
