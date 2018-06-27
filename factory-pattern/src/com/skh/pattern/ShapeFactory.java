package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/6/27 Time: 11:05.
 * Description: 工厂类
 */
public class ShapeFactory {

    // 根据输入的不同形状来获取相应对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equals("circle")) {
            return new Circle();
        } else if (shapeType.equals("square")) {
            return new Square();
        } else if (shapeType.equals("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
