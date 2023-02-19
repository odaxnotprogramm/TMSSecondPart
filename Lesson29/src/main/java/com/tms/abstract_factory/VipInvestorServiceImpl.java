package com.tms.abstract_factory;

public class VipInvestorServiceImpl implements InvestorService{
    @Override
    public Investor create() {
        return new Investor("Binance",2020558990);
    }
}
