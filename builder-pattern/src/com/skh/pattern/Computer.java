package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/3 Time: 16:26.
 * Description:要组装一台电脑（Computer类），假设它有三个部件：CPU 、主板以及内存。
 * 在Computer类中提供三个set方法分别设置这三个属性。
 */
public class Computer {
    private String mCpu;

    private String mMainboard;

    private String mRam;

    public void setmCpu(String mCpu) {
        this.mCpu = mCpu;
    }

    public void setmMainboard(String mMainboard) {
        this.mMainboard = mMainboard;
    }

    public void setmRam(String mRam) {
        this.mRam = mRam;
    }

    public String getmCpu() {
        return mCpu;
    }

    public String getmMainboard() {
        return mMainboard;
    }

    public String getmRam() {
        return mRam;
    }
}
