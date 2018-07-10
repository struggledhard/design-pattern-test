package com.skh.pattern;

/**
 * Created by User: admin.
 * Date: 2018/7/10 Time: 14:39.
 * Description: 创建一个表达式接口
 */
public interface Expression {
    boolean interpret(String context);
}
