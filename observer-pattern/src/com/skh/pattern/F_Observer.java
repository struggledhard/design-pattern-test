package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/13 Time: 16:24.
 * Description:
 */
public class F_Observer extends Observer {
    @Override
    public void update(String msg) {
        System.out.println(F_Observer.class.getName() + " : " + msg);
    }
}
