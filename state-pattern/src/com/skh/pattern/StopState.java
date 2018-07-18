package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/18 Time: 14:25.
 * Description:
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
