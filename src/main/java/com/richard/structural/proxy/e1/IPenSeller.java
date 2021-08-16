package com.richard.structural.proxy.e1;

/**
 * 钢笔卖家（抽象主题角色）
 * @author Richard.Shan
 * @since 2021-08-16
 */
public interface IPenSeller extends Factory {

    void sell(int quantity);
}
