package com.tms.abstract_factory;

public class RichInvestorServiceImpl implements InvestorService{
    @Override
    public Investor create() {
        return new Investor("Polychain Capital",1000000);
    }
}
