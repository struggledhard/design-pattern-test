package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/4 Time: 16:37.
 * Description:实现了 AdvancedMediaPlayer 接口的实体类。
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playMp4(String fileName) {
        System.out.print("MP4 file name" + fileName);
    }
}
