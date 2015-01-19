package userInterface;


import model.Currency;

public class CurrencyViewer {

    public void show(Currency currency) {
        System.out.println(currency.getCode());
    }
}