package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/10 Time: 11:11.
 * Description:
 */
public class BuyStock implements Order {
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
