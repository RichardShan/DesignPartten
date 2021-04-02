package com.richard.creational.abstract_factory.stract;

/**
 * @author Richard.Shan
 * @since 2021-04-02
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2("A", "2");
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2("B", "2", 2);
    }
}
