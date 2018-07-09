package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/9 Time: 16:24.
 * Description:
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
