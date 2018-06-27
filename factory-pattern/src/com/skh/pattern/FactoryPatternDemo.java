package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/6/27 Time: 11:12.
 * Description:
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shapeCircle = shapeFactory.getShape("circle");

        //调用 Circle 的 draw 方法
        shapeCircle.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shapeRectangle = shapeFactory.getShape("rectangle");

        //调用 Rectangle 的 draw 方法
        shapeRectangle.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shapeSquare = shapeFactory.getShape("square");

        //调用 Square 的 draw 方法
        shapeSquare.draw();
    }
}
