package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/18 Time: 16:46.
 * Description:
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
