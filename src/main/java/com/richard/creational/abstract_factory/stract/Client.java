package com.richard.creational.abstract_factory.stract;

/**
 * @author Richard.Shan
 * @since 2021-04-02
 */
public class Client {
    private AbstractFactory factory;

    private void someOperation() {
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();

        System.out.println("###############################");
        System.out.printf("Type: %s|Name: %s\n", productA.getType(), productA.getName());
        System.out.printf("Type: %s|Name: %s\n", productB.getType(), productB.getName());
        System.out.println("###############################");
    }

    public Client(String type) {
        if ("1".equals(type)) {
            this.factory = new ConcreteFactory1();
        } else if ("2".equals(type)) {
            this.factory = new ConcreteFactory2();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        Client client = new Client("1");
        client.someOperation();
        Client client2 = new Client("2");
        client2.someOperation();
    }
}
