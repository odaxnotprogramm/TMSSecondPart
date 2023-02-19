package com.tms.abstract_factory;

public class BinanceOwnerServiceImpl implements OwnerService{
    @Override
    public Owner create() {
        return new Owner("Satoshi");
    }
}
