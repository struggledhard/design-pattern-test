package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/18 Time: 15:40.
 * Description:
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
