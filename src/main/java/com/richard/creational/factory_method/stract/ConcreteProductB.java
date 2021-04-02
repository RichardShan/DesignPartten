package com.richard.creational.factory_method.stract;

/**
 * @author Richard.Shan
 * @since 2021-04-02
 */
public class ConcreteProductB implements Product {

    private String name;
    private String type;
    private int level;

    public ConcreteProductB(String name, String type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;
    }

    @Override
    public void doStuff() {
        System.out.printf("Name: %s|Type: %s|Level:%d\n", name, type, level);
    }
}
