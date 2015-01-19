package controller;

import java.io.IOException;
import java.util.Calendar;
import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;
import userInterface.ExchangeDialog;
import userInterface.MoneyDisplay;
import userInterface.MoneyViewer;
import persistence.CurrencySetLoader;
import persistence.ExchangeRateLoader;

public class ExchangeOperator {
    private final CurrencySet currencySet;
    private final MoneyDisplay consoleMoneyDialog;
    private final ExchangeDialog consoleCurrencyDialog;
    private final Exchange moneyExchanger;
    private ExchangeRate exchangeRate;

    public ExchangeOperator(CurrencySet currencySet, MoneyDisplay consoleMoneyDialog, ExchangeDialog consoleCurrencyDialog) {
        this.currencySet = currencySet;
        this.consoleMoneyDialog = consoleMoneyDialog;
        this.moneyExchanger = new Exchange();
        this.consoleCurrencyDialog = consoleCurrencyDialog;
    }

    public void execute() throws IOException {
        loadCurrencySet(currencySet);
        consoleMoneyDialog.execute();
        consoleCurrencyDialog.execute();
        exchangeRate = loadExchangeRate();
        doMoneyExchange();
        show();
    }

    private void loadCurrencySet(CurrencySet currencySet) {
        CurrencySetLoader currencySetLoader = new CurrencySetLoader();
        CurrencySetLoader.load(currencySet);
    }

    private ExchangeRate loadExchangeRate() {
        ExchangeRateLoader exchangeRateLoader = new ExchangeRateLoader();
        return exchangeRateLoader.load(Calendar.getInstance(), consoleMoneyDialog.getMoney().getCurrency(), consoleCurrencyDialog.getCurrency());
    }

    private void doMoneyExchange() {
        moneyExchanger.exchange(consoleMoneyDialog.getMoney(), exchangeRate);
    }

    private void show() {
        MoneyViewer moneyViewer = new MoneyViewer();
        moneyViewer.show(moneyExchanger.getMoney());
    }
}
