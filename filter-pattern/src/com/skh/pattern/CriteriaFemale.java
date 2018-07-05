package com.skh.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User: skh.
 * Date: 2018/7/5 Time: 14:54.
 * Description:
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> setFilter(List<Person> persons) {
        List<Person> people = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equals("female")) {
                people.add(person);
            }
        }
        return people;
    }
}
