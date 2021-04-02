package com.richard.creational.abstract_factory.stract;

/**
 * @author Richard.Shan
 * @since 2021-04-02
 */
public class ConcreteProductB2 implements ProductB {

    private String name;
    private String type;
    private int status;

    public ConcreteProductB2(String name, String type, int status) {
        this.name = name;
        this.type = type;
        this.status = status;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getStatus() {
        return status;
    }
}
