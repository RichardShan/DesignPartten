package com.richard.structural.proxy.e1;

import java.text.MessageFormat;

/**
 * @author Richard.Shan
 * @since 2021-08-16
 */
public class NotebookFactory implements INotebookSeller {

    private final String name;

    public NotebookFactory(String name) {
        this.name = name;
        System.out.println(MessageFormat.format("[{0}] 笔记本工厂开业了。", name));
    }

    @Override
    public void sell(int quantity) {
        System.out.println(MessageFormat.format("[{0}] 卖掉了[{1}]个笔记本", name, quantity));
    }

    @Override
    public String getFactoryName() {
        return name;
    }
}
