package com.richard.creational.factory_method.stract;

/**
 * @author Richard.Shan
 * @since 2021-04-02
 */
public abstract class Creator {
    public void someOperation() {
        Product product = createProduct();
        System.out.println("###############################");
        System.out.println("Creator operation");
        product.doStuff();
        System.out.println("###############################");
    }

    abstract Product createProduct();
}
