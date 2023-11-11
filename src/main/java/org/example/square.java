package org.example;

public class square implements shape {
    private int width;

    public square(int width) {
        this.width = width;
    }

    @Override
    public Integer computeArea() {
        return width * width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
