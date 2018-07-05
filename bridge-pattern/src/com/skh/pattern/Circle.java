package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/5 Time: 11:19.
 * Description: 实现了 Shape 接口的实体类。
 */
public class Circle extends Shape {
    private int radius;
    private int x;
    private int y;

    public Circle(int radius, int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
