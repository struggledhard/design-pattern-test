package com.skh.pattern;

import java.util.Date;

/**
 * Created by User: skh.
 * Date: 2018/7/11 Time: 11:14.
 * Description: 创建中介类
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() +"] : " + message);
    }
}
