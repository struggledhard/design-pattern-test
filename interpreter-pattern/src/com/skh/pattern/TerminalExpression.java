package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/10 Time: 14:41.
 * Description:
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
