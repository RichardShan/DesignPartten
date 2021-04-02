package com.richard.creational.factory_method;

/**
 * @author Richard.Shan
 * @since 2021-04-02
 */
public class ConcreteCreatorA extends Creator{
    @Override
    Product createProduct() {
        return new ConcreteProductA("A", "product");
    }
}
