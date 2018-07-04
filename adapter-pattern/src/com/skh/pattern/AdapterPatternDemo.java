package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/4 Time: 16:51.
 * Description:适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。
 * 这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "海阔天空.mp3");
        audioPlayer.play("mp4", "七里香.mp4");
    }
}
