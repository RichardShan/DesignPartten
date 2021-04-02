package com.richard.creational.factory_method.stract;

/**
 * @author Richard.Shan
 * @since 2021-04-02
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Creator creatorB = new ConcreteCreatorB();
        creatorA.someOperation();
        creatorB.someOperation();
    }
}
