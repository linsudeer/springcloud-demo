package com.linsu.smartpark.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        // 遍历数组
        Arrays.asList("a", "b", "c", "d").forEach((x) -> System.out.println(x));

        /**
         * map 作用是将一个对象变为另一个
         * reduce 是将一组对象合并
         */
        Arrays.asList(1, 2, 3, 4, 5).stream().map(x -> x*2). forEach(x -> System.out.println(x));
        Integer all = Arrays.asList(1, 2, 3, 4, 5).stream().reduce((sum, x) -> sum +x).get();
        System.out.println(all);

        List<Double> cost = Arrays.asList(10.0, 20.0,30.0,40.0);
        List<Double> filteredCost = cost.stream().filter(x -> x > 25.0).collect(Collectors.toList());
        filteredCost.forEach(x -> System.out.println(x));


    }
}
