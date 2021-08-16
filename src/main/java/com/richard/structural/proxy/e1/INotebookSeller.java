package com.richard.structural.proxy.e1;

/**
 * 笔记本卖家（抽象主题角色）
 *
 * @author Richard.Shan
 * @since 2021-08-16
 */
public interface INotebookSeller extends Factory {

    /**
     * 卖笔记本
     *
     * @param quantity
     */
    void sell(int quantity);
}
