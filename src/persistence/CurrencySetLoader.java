package persistence;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {

    public static class load {
        CurrencySet currencyset;
        
        public load() {
            currencyset = new CurrencySet();
            
            currencyset.add("Euro", new Currency("Euro", "EUR", "€"));
            currencyset.add("Dolar", new Currency("Dolar Norteamericano", "USD", "$"));
            currencyset.add("Libra", new Currency("Libra Esterlina", "GBP", "£"));
        }
    }
    
}
