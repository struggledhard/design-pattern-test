package com.skh.pattern;

import com.skh.pattern.color.Color;
import com.skh.pattern.shape.Circle;
import com.skh.pattern.shape.Rectangle;
import com.skh.pattern.shape.Shape;
import com.skh.pattern.shape.Square;

/**
 * Created by User: skh.
 * Date: 2018/6/27 Time: 15:09.
 * Description:扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String colorType) {
        return null;
    }

    @Override
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
