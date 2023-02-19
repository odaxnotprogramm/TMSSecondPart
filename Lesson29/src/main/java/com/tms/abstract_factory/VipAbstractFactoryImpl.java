package com.tms.abstract_factory;

public class VipAbstractFactoryImpl implements AbstractFactory{
    @Override
    public BlockchainService getBlockchain() {
        return new BinanceBlockchainServiceImpl();
    }

    @Override
    public InvestorService getInvestor() {
        return new VipInvestorServiceImpl();
    }

    @Override
    public OwnerService getOwner() {
        return new BinanceOwnerServiceImpl();
    }
}
