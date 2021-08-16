package com.richard.structural.proxy.e1;

import java.text.MessageFormat;

/**
 * @author Richard.Shan
 * @since 2021-08-16
 */
public class Store implements INotebookSeller {


    private final String name;

    /**
     * 供应产品的工厂
     */
    private final NotebookFactory notebookFactory;

    /**
     * 合同按照固定量的倍数采购
     */
    private final int purchaseQuantity;


    /**
     * 库存
     */
    private int stockBalance;


    public Store(String name, NotebookFactory notebookFactory, int purchaseQuantity) {
        this.name = name;
        this.notebookFactory = notebookFactory;
        this.purchaseQuantity = purchaseQuantity;
        System.out.println(MessageFormat.format("[{0}]的笔记本商店开业了，请[{1}]笔记本工厂做了自己的供应商，约定每次按照[{2}]个的倍数采购",
                name, notebookFactory.getFactoryName(), purchaseQuantity));
    }

    @Override
    public void sell(int quantity) {
        if (quantity > stockBalance) {
            int needPurchaseQuantity = (quantity - stockBalance + purchaseQuantity - 1) / purchaseQuantity * purchaseQuantity;
            System.out.println(MessageFormat.format("[{0}]的笔记本商店库存不足，于是向供应商采购了[{1}]个。", name, needPurchaseQuantity));
            notebookFactory.sell(needPurchaseQuantity);
            stockBalance += needPurchaseQuantity;
        }
        stockBalance -= quantity;
        System.out.println(MessageFormat.format("商店卖出了[{0}]个笔记本，库存余[{1}]个", quantity, stockBalance));
    }

    @Override
    public String getFactoryName() {
        return getFactoryName();
    }
}
