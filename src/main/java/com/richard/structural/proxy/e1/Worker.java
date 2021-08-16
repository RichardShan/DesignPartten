package com.richard.structural.proxy.e1;

import java.text.MessageFormat;

/**
 * @author Richard.Shan
 * @since 2021-08-16
 */
public class Worker {

    private final String name;

    public Worker(String name) {
        this.name = name;
        System.out.println(MessageFormat.format("打工人[{0}]，为了得到自己想要的东西努力赚钱。", name));
    }

    public void buy(INotebookSeller seller, int quantity) {
        System.out.println(MessageFormat.format("打工人[{0}]要买[{1}]个笔记本。", name, quantity));
        seller.sell(quantity);
    }


    public void buy(IPenSeller seller, int quantity) {
        System.out.println(MessageFormat.format("打工人[{0}]要买[{1}]支钢笔。", name, quantity));
        seller.sell(quantity);
    }

    private static void newDay() {
        System.out.println();
        System.out.println("有一天：");
    }

    public static void main(String[] args) {
//        newDay();
//        NotebookFactory factory = new NotebookFactory("Macs");
//        Store store = new Store("小当家", factory, 10);
//        Worker worker = new Worker("小明");
//        worker.buy(store, 15);
        newDay();
        Platform platform = new Platform("大卖场");
        platform.registerStore("笔记本", INotebookSeller.class, new NotebookFactory("晨光"), 50);
        platform.registerStore("钢笔", IPenSeller.class, new PenFactory("晨光"), 100);

        INotebookSeller notebookSeller = platform.findStore(INotebookSeller.class);
        IPenSeller penSeller = platform.findStore(IPenSeller.class);

        Worker worker = new Worker("李明");
        worker.buy(notebookSeller, 20);
        worker.buy(penSeller, 10);
    }
}
