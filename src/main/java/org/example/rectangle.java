package org.example;

public class rectangle implements shape {

    private int height = 2;
    private int width = 2;

    public rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public rectangle() {
    }

    @Override
    public Integer computeArea() {
        return height * width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
