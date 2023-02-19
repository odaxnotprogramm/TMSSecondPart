package com.tms.abstract_factory;

public class RichAbstractFactoryImpl implements AbstractFactory{
    @Override
    public BlockchainService getBlockchain() {
        return new TronBlockchainServiceImpl();
    }

    @Override
    public InvestorService getInvestor() {
        return new RichInvestorServiceImpl();
    }

    @Override
    public OwnerService getOwner() {
        return new TronOwnerServiceImpl();
    }
}
