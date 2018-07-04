package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/4 Time: 16:47.
 * Description:实现了 MediaPlayer 接口的实体类。
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter adapter = new MediaAdapter();

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp3")) {
            System.out.println("mp3 file name" + fileName);
        } else if (audioType.equals("mp4")) {
            adapter.play(audioType, fileName);
        }
    }
}
