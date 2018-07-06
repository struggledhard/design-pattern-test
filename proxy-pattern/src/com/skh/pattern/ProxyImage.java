package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/6 Time: 16:09.
 * Description:
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
