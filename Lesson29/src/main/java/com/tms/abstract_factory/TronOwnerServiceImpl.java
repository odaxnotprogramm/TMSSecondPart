package com.tms.abstract_factory;

public class TronOwnerServiceImpl implements OwnerService{
    @Override
    public Owner create() {
        return new Owner("Pavel Durov");
    }
}
