package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/5 Time: 11:16.
 * Description: 使用 DrawAPI 接口创建抽象类 Shape。
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
