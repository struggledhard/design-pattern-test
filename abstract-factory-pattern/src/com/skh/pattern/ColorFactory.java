package com.skh.pattern;

import com.skh.pattern.color.Color;
import com.skh.pattern.color.Green;
import com.skh.pattern.color.Red;
import com.skh.pattern.shape.Shape;

/**
 * Created by User: skh.
 * Date: 2018/6/27 Time: 15:16.
 * Description:扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equals("red")) {
            return new Red();
        } else if (colorType.equals("green")) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
