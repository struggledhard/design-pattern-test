package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/6 Time: 16:12.
 * Description: 在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
 *
 *  1、和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。
 *  2、和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制。
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("aaa.jpg");

        image.display();
    }
}
