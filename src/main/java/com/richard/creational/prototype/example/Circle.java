package com.richard.creational.prototype.example;

/**
 * @author Richard.Shan
 * @since 2021-04-06
 */
public class Circle extends Shape {

    private int radius;

    public Circle() {
    }

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    @Override
    public Shape copy() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
