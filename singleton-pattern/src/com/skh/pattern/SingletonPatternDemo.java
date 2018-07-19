package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/19 Time: 10:25.
 * Description: 一般情况下，不建议使用懒汉方式，建议使用饿汉方式。
 * 只有在要明确实现 lazy loading 效果时，才会使用静态类部类方式。
 * 如果涉及到反序列化创建对象时，可以尝试使用枚举方式。如果有其他特殊的需求，可以考虑使用双检锁方式。
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();
    }
}
