package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/13 Time: 16:25.
 * Description:
 */
public class S_Observer extends Observer {
    @Override
    public void update(String msg) {
        System.out.println(S_Observer.class.getName() + " : " + msg);
    }
}
