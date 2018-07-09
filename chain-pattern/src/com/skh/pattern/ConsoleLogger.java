package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/9 Time: 16:22.
 * Description:
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
