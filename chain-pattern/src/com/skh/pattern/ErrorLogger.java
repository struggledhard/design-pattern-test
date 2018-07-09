package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/9 Time: 16:23.
 * Description:
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
