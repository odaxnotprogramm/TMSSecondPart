package com.tms.abstract_factory;

public class MainService {
    public void createCoin (AbstractFactory factory){
        OwnerService ownerService = factory.getOwner();
        Owner owner = ownerService.create();
        System.out.println(owner.toString());

        BlockchainService blockchainService = factory.getBlockchain();
        Blockchain blockchain = blockchainService.create();
        System.out.println(blockchain.toString());

        InvestorService investorService = factory.getInvestor();
        Investor investor = investorService.create();
        System.out.println(investor.toString());
    }
}
