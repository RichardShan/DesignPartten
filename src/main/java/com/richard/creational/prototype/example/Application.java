package com.richard.creational.prototype.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Richard.Shan
 * @since 2021-04-06
 */
public class Application {

    List<Shape> shapes = new ArrayList<>();


    public Application() {
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setColor("RED");
        circle.setName("Circle");

        circle.setRadius(10);

        shapes.add(circle);
        shapes.add(circle.copy());


        Rectangle rectangle = new Rectangle();
        rectangle.setX(20);
        rectangle.setY(20);
        rectangle.setColor("GREEN");
        rectangle.setName("Rectangle");

        rectangle.setWidth(20);
        rectangle.setHeight(10);

        shapes.add(rectangle);
    }

    public static void main(String[] args) {
        Application application = new Application();
        List<Shape> shapes = application.shapes;
        List<Shape> copyShapes = new ArrayList<>();
        for (Shape shape : shapes) {
            System.out.println(shape.getName());
            copyShapes.add(shape.copy());
        }

        System.out.println("##########################");

        for (Shape shape : copyShapes) {
            System.out.println("copy:" + shape.getName());
        }
    }
}
