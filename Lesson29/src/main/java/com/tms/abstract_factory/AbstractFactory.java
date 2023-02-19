package com.tms.abstract_factory;

public interface AbstractFactory {
    OwnerService getOwner();
    BlockchainService getBlockchain();
    InvestorService getInvestor();
}
