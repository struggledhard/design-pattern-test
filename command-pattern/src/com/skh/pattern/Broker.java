package com.skh.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User: skh.
 * Date: 2018/7/10 Time: 11:26.
 * Description: 创建命令调用类
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrder() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
