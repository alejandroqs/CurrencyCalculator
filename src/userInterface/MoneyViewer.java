package userInterface;

import model.Money;

public class MoneyViewer {

    public void show(Money money) {
        System.out.println(money.getAmount() + " " + money.getCurrency().getCode());
    }
}