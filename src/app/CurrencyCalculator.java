package app;

import controller.ExchangeOperator;
import model.CurrencySet;
import userInterface.ExchangeDialog;
import userInterface.MoneyDisplay;
import java.io.IOException;

public class CurrencyCalculator {
    public static void main (String[] args) throws IOException {
        CurrencySet currencies = CurrencySet.getInstance();
        MoneyDisplay consoleMoneyDialog = new MoneyDisplay();
        ExchangeDialog consoleCurrencyDialog = new ExchangeDialog();
        ExchangeOperator control = new ExchangeOperator(currencies, consoleMoneyDialog, consoleCurrencyDialog);
        control.execute();
    }
}