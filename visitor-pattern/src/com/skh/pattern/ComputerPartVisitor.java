package com.skh.pattern;

/**
 * Created by User: admin.
 * Date: 2018/7/18 Time: 16:37.
 * Description: 定义一个表示访问者的接口
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
