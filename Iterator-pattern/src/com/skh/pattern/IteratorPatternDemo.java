package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/10 Time: 15:29.
 * Description: 迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。
 * 这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 *
 * 迭代器模式属于行为型模式。
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository repository = new NameRepository();

        for (Iterator iterator = repository.getIterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
