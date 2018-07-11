package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/11 Time: 11:19.
 * Description: 中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。
 * 这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。中介者模式属于行为型模式。
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User jone = new User("Jone");

        robert.sendMessage("Hi Jone");
        jone.sendMessage("Hello Robert");
    }
}
