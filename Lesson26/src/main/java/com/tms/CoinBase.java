package com.tms;

import java.util.ArrayList;
import java.util.List;

public class CoinBase {
    private static final List<Coin> coinList = new ArrayList<>();

    public static void addCoin (Coin coin){
        coinList.add(coin);
    }

    public static List<Coin> getAllCoins(){
        return coinList;
    }

    public void changeCoinParameteres(int id, String name, double price){
        for(Coin coin : coinList){
            if(coin.getID() == id) {
                coin.setName(name);
                coin.setPrice(price);
            }
        }
    }
    public static Coin getCoinById (int id){
        for(Coin coin : coinList){
            if(coin.getID() == id) return coin;
        }
        return null;
    }

    public static void deleteCoinById (int id){
        coinList.remove(getCoinById(id));
    }
}
