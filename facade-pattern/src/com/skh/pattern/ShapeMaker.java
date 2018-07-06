package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/6 Time: 14:12.
 * Description: 创建一个外观类。
 */
public class ShapeMaker {
    private Shape rectangle;
    private Shape circle;

    public ShapeMaker() {
        rectangle = new Rectangle();
        circle = new Circle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
