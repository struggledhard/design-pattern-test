package com.skh.pattern;

import com.skh.pattern.color.Color;
import com.skh.pattern.shape.Shape;

/**
 * Created by User: skh.
 * Date: 2018/6/27 Time: 15:06.
 * Description:
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String colorType);
    public abstract Shape getShape(String shapeType);
}
