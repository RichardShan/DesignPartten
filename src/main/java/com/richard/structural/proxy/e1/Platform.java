package com.richard.structural.proxy.e1;

import java.lang.reflect.Proxy;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Richard.Shan
 * @since 2021-08-16
 */
public class Platform {

    private final String name;

    private final Map<Class<? extends Factory>, Object> storeMap = new HashMap<>();

    public Platform(String name) {
        this.name = name;
        System.out.println(MessageFormat.format("[{0}] 电商平台开业了。", name));
    }

    public <T extends Factory> void registerStore(String name, Class<T> clazz, T factory, int purchaseQuantity) {
        T seller = (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class<?>[]{clazz},
                new PlatformStore(name, this, factory, purchaseQuantity));
        storeMap.put(clazz, seller);
    }

    public <T extends Factory> T findStore(Class<T> clazz) {
        return (T) storeMap.get(clazz);
    }
}
