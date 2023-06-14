package com.roblesdotdev.advancedjava.interfaces.defaults;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DefaultMethodsDemo {
    public static void main(String[] args) {
        List<Integer> nums = Stream.of(-3, 1, 4, -5, 2, -6)
                .collect(Collectors.toList());
        System.out.println(nums);

        // removeIf is a default method in Collection
        boolean removed = nums.removeIf(n -> n <= 0);
        System.out.println("Elements where " + (removed ? "" : "NOT") + "removed");
        System.out.println(nums);

        nums.forEach(System.out::println);
    }
}
