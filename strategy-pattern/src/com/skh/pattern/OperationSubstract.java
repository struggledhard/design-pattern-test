package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/18 Time: 15:38.
 * Description:
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
