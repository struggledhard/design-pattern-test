package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/6 Time: 11:14.
 * Description: 创建扩展了 ShapeDecorator 类的实体装饰类。
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    public void draw() {
        shapeDecorator.draw();
        setRedColor(shapeDecorator);
    }

    private void setRedColor(Shape shape) {
        System.out.println("Border Color: Red");
    }
}
