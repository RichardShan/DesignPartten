package com.richard.creational.factory_method.stract;

/**
 * @author Richard.Shan
 * @since 2021-04-02
 */
public class ConcreteCreatorB extends Creator {
    @Override
    Product createProduct() {
        return new ConcreteProductB("B", "product", 1);
    }
}
