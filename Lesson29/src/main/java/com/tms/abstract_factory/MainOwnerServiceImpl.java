package com.tms.abstract_factory;

public class MainOwnerServiceImpl implements OwnerService{
    @Override
    public Owner create() {
        return new Owner("Satoshi");
    }
}
