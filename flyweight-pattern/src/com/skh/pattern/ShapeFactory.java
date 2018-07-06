package com.skh.pattern;

import java.util.HashMap;

/**
 * Created by User: skh.
 * Date: 2018/7/6 Time: 15:01.
 * Description: 创建一个工厂，生成基于给定信息的实体类的对象。
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleShape = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleShape.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleShape.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
