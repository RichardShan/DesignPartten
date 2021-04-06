package com.richard.creational.prototype.example;

/**
 * @author Richard.Shan
 * @since 2021-04-06
 * <p>
 * 基础原型
 */
public abstract class Shape {
    private int x;
    private int y;
    private String color;

    private String name;

    public Shape() {
    }

    public Shape(Shape source) {
        this();
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
        this.name = source.name;
    }

    abstract public Shape copy();


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
