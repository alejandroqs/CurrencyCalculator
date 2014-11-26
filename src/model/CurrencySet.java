package model;

import java.util.HashMap;

public class CurrencySet{
    private final HashMap currencyset;

    public CurrencySet() {
        currencyset = new HashMap();
    }
    public Object add(String s, Currency c){
        return currencyset.put(s, c);
    }
}
