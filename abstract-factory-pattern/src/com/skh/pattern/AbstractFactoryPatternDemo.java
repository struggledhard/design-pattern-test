package com.skh.pattern;

import com.skh.pattern.color.Color;
import com.skh.pattern.shape.Shape;

/**
 * Created by User: skh.
 * Date: 2018/6/27 Time: 15:25.
 * Description:
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProdecer.getFactory("shape");

        //获取形状为 Circle 的对象
        Shape shape1 = shapeFactory.getShape("circle");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取形状为 Rectangle 的对象
        Shape shape2 = shapeFactory.getShape("rectangle");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取形状为 Square 的对象
        Shape shape3 = shapeFactory.getShape("square");

        //调用 Square 的 draw 方法
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProdecer.getFactory("color");

        //获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor("red");

        //调用 Red 的 fill 方法
        color1.fill();

        //获取颜色为 Green 的对象
        Color color2 = colorFactory.getColor("green");

        //调用 Green 的 fill 方法
        color2.fill();
    }
}
