package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/3 Time: 16:38.
 * Description:一个继承Builder的子类，里面不仅新建了Computer的实例，
 * 还提供了安装CPU、主板和内存的具体实现方法，并且在组装成电脑的create方法中将该Computer对象实例返回。
 */
public class ComputerBuilder extends Builder {

    Computer computer = new Computer();

    @Override
    public void buildCpu(String cpu) {
        computer.setmCpu(cpu);
    }

    @Override
    public void buildMainboard(String mainboard) {
        computer.setmMainboard(mainboard);
    }

    @Override
    public void buildRam(String ram) {
        computer.setmRam(ram);
    }

    @Override
    public Computer create() {
        return computer;
    }
}
