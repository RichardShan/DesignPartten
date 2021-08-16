package com.richard.structural.proxy.e1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.MessageFormat;

/**
 * @author Richard.Shan
 * @since 2021-08-16
 */
public class PlatformStore implements InvocationHandler {

    /**
     * 商品名
     */
    private final String name;

    /**
     * 平台
     */
    private final Platform platform;

    /**
     * 真实卖家
     */
    private final Factory factory;

    /**
     * 合约采购基数
     */
    private final int purchaseQuantity;


    /**
     * 库存
     */
    private int stockBalance;


    public PlatformStore(String name, Platform platform, Factory factory, int purchaseQuantity) {
        this.name = name;
        this.platform = platform;
        this.factory = factory;
        this.purchaseQuantity = purchaseQuantity;
        System.out.println(MessageFormat.format("平台的[{0}]商店上线了，请[{1}]工厂做了自己的供应商， 约定每次按照[{2}]的倍数采购",
                name, factory.getFactoryName(), purchaseQuantity));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        int quantity = (int) args[0];
        if (quantity > stockBalance) {
            int needPurchaseQuantity = (quantity - stockBalance + purchaseQuantity - 1) / purchaseQuantity * purchaseQuantity;
            System.out.println(MessageFormat.format("平台[{0}]库存不足，于是向供应商采购了[{1}]个。", name, needPurchaseQuantity));
            args[0] = needPurchaseQuantity;
            method.invoke(factory, args);
            stockBalance += needPurchaseQuantity;
        }
        stockBalance -= quantity;
        System.out.println(MessageFormat.format("平台卖出了[{0}]个[{1}], 库存余[{2}]个", quantity, name, stockBalance));
        return null;
    }
}
