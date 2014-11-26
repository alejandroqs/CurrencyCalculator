package model;

public class ExchangeRate {
    private final Currency from;
    private final Currency to;

    public ExchangeRate(Currency from, Currency to) {
        this.from = from;
        this.to = to;
    }
}
