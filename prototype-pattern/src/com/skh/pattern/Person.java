package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/4 Time: 15:27.
 * Description:
 */
public class Person implements Cloneable {
    private String name;
    private String sex;
    private int age;
    private String school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * 克隆该实例
     */
    public Object clone() {
        Person person = null;
        try {
            person = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }

    public void display() {
        System.out.println("姓名：" + name + "---性别：" + sex);
        System.out.println("年龄：" + age + "---学校：" + school);
    }
}
