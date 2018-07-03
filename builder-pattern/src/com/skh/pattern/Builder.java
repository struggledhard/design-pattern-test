package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/3 Time: 16:36.
 * Description:一个抽象的Builder类，里面提供了安装CPU、主板和内存的抽象方法，以及组装成电脑的create方法。
 */
public abstract class Builder {
    public abstract void buildCpu(String cpu);

    public abstract void buildMainboard(String mainboard);

    public abstract void buildRam(String ram);

    public abstract Computer create();
}
