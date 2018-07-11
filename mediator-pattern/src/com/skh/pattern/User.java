package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/11 Time: 11:15.
 * Description:
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
