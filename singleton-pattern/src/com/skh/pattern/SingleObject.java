package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/19 Time: 10:19.
 * Description: 饿汉式单例
 * 这种方式比较常用，但容易产生垃圾对象
 * 没有加锁，执行效率会提高
 * 类加载时就初始化，浪费内存
 */
public class SingleObject {

    // 创建 SingleObject 的一个对象
    private static SingleObject singleObject = new SingleObject();

    // 让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    // 获取唯一可用的对象
    public static SingleObject getInstance() {
        return singleObject;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
