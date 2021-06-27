package com.github.hpchugo.currying;

import java.util.function.Function;

public class Currying {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Integer>> fun1 = u -> v -> u + v;
        var sum = fun1.apply(2).apply(3);
        System.out.println(sum);
    }
}
