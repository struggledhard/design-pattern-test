package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/18 Time: 15:15.
 * Description:
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
