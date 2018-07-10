package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/10 Time: 11:12.
 * Description:
 */
public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
