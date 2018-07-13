package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/13 Time: 16:30.
 * Description: 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。
 * 比如，当一个对象被修改时，则会自动通知它的依赖对象。观察者模式属于行为型模式。
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        F_Observer fObserver = new F_Observer();
        S_Observer sObserver = new S_Observer();

        Subject subject = new Subject();
        subject.addAttach(fObserver);
        subject.addAttach(sObserver);

        subject.setMsg("msg change");
    }
}
