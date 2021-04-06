package com.richard.creational.prototype.example;

/**
 * @author Richard.Shan
 * @since 2021-04-06
 */
public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle source) {
        super(source);

        this.width = source.width;
        this.height = source.height;
    }


    @Override
    public Rectangle copy() {
        return new Rectangle(this);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
