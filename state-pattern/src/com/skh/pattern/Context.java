package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/18 Time: 14:20.
 * Description:
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
