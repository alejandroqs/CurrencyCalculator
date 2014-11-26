package persistence;

import model.Currency;
import model.ExchangeRate;

public class ExchangeRateLoader {
    private ExchangeRate exchangerate;
    
    public void load(Currency from, Currency to){
        exchangerate = new ExchangeRate(from, to);
    }
}
