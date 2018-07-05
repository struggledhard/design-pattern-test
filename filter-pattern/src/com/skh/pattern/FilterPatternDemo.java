package com.skh.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User: skh.
 * Date: 2018/7/5 Time: 14:57.
 * Description: 过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，
 * 这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。
 * 这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。
 */
public class FilterPatternDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Jone", "male"));
        personList.add(new Person("Mike", "female"));
        personList.add(new Person("Bobby", "female"));
        personList.add(new Person("Ro", "male"));
        personList.add(new Person("Han", "male"));

        Criteria criteriaMale = new CriteriaMale();
        Criteria criteriaFemale = new CriteriaFemale();

        System.out.println("males:");
        displayPerson(criteriaMale.setFilter(personList));

        System.out.println("\nFemales");
        displayPerson(criteriaFemale.setFilter(personList));
    }

    public static void displayPerson(List<Person> personList) {
        for (Person person : personList) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +" ]");
        }
    }
}
