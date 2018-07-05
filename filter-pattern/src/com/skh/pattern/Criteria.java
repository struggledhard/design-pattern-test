package com.skh.pattern;

import java.util.List;

/**
 * Created by User: admin.
 * Date: 2018/7/5 Time: 14:47.
 * Description: 为标准（Criteria）创建一个接口。
 */
public interface Criteria {
    List<Person> setFilter(List<Person> persons);
}
