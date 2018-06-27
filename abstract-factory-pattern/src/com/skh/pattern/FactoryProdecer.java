package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/6/27 Time: 15:19.
 * Description:创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 */
public class FactoryProdecer {
    public static AbstractFactory getFactory(String factory) {
        if (factory == null) {
            return null;
        }
        if (factory.equals("shape")) {
            return new ShapeFactory();
        } else if (factory.equals("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
