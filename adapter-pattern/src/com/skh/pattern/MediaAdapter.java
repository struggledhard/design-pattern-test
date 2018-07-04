package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/4 Time: 16:39.
 * Description:实现了 MediaPlayer 接口的适配器类。
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer player;

    public MediaAdapter() {
        player = new Mp4Player();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp4")) {
            player.playMp4(fileName);
        }
    }
}
