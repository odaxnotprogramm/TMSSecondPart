package com.tms.abstract_factory;

public class BinanceBlockchainServiceImpl implements BlockchainService{
    @Override
    public Blockchain create() {
        return new Blockchain(734529561,"BSC");
    }
}
