package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/13 Time: 10:42.
 * Description: Originator 创建并在 Memento 对象中存储状态
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
