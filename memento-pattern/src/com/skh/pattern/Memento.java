package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/13 Time: 10:34.
 * Description: 包含了要被恢复的对象的状态
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
