package com.skh.pattern;

/**
 * Created by User: admin.
 * Date: 2018/7/18 Time: 16:46.
 * Description:
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
