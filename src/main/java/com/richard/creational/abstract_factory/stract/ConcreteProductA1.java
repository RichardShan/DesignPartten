package com.richard.creational.abstract_factory.stract;

/**
 * @author Richard.Shan
 * @since 2021-04-02
 */
public class ConcreteProductA1 implements ProductA {

    private String name;
    private String type;

    public ConcreteProductA1(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }
}
