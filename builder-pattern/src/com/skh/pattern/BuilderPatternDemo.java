package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/3 Time: 16:40.
 * Description:
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Builder builder = new ComputerBuilder();
        builder.buildCpu("8核");
        builder.buildMainboard("牛逼的很");
        builder.buildRam("32G");

        Computer computer = builder.create();

        System.out.println(computer.getmCpu());
        System.out.println(computer.getmMainboard());
        System.out.println(computer.getmRam());
    }
}
