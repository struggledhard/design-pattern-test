package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/5 Time: 14:42.
 * Description: 创建一个类，在该类上应用标准。
 */
public class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
