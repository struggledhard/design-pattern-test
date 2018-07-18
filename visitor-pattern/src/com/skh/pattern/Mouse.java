package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/18 Time: 16:47.
 * Description:
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
