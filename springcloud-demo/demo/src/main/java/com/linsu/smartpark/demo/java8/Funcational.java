package com.linsu.smartpark.demo.java8;

/**
 * 函数式接口
 */
@FunctionalInterface
public interface Funcational {
    void add (int x, int y);

    /**
     * 默认方法
     */
    default void info() {
        System.out.println("这是一个自定义的函数式接口");
    }

    /**
     * 静态方法
     * @return
     */
    static String test() {
        return "";
    }
}
