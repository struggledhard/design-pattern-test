package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/4 Time: 15:40.
 * Description:原型模式就是用原型实例指定创建对象的种类，并且通过复制这些原型创建新的对象。
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        // 原型对象
        Person personA = new Person();
        personA.setName("Kobe");
        personA.setSex("男");
        personA.setAge(38);
        personA.setSchool("加州大学");

        // 克隆新的对象
        Person personB = (Person) personA.clone();

        //输出A和B对象
        System.out.println("----------------A--------------");
        personA.display();
        System.out.println("----------------B--------------");
        personB.display();

        /*
         * 测试personA==personB?
         * 对任何的对象x，都有x.clone() !=x，即克隆对象与原对象不是同一个对象
         */
        System.out.print("是否是同一对象");
        System.out.println(personA == personB);

        /*
         * 对任何的对象x，都有x.clone().getClass()==x.getClass()，即克隆对象与原对象的类型一样。
         */
        System.out.print("是否是同一类型");
        System.out.println(personA.getClass() == personB.getClass());
    }
}
