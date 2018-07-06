package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/6 Time: 11:03.
 * Description: 创建实现了 Shape 接口的抽象装饰类。
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape shapeDecorator;

    public ShapeDecorator(Shape shapeDecorator) {
        this.shapeDecorator = shapeDecorator;
    }

    public void draw() {
        shapeDecorator.draw();
    }
}
