package com.richard.creational.factory_method;

/**
 * @author Richard.Shan
 * @since 2021-04-02
 */
public class ConcreteProductA implements Product {

    private String name;
    private String type;

    public ConcreteProductA(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void doStuff() {
        System.out.printf("Name: %s|Type: %s\n", name, type);
    }
}
