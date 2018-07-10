package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/10 Time: 11:07.
 * Description: 创建一个请求类
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity +" ] sold");
    }
}
