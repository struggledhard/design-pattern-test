package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/5 Time: 11:09.
 * Description:实现了 DrawAPI 接口的实体桥接实现类。
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
