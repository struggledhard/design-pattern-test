package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/18 Time: 15:16.
 * Description:
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
