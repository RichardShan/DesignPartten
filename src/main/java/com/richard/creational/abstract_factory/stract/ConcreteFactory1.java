package com.richard.creational.abstract_factory.stract;

/**
 * @author Richard.Shan
 * @since 2021-04-02
 */
public class ConcreteFactory1 implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1("A", "1");
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1("B", "1", 1);
    }
}
