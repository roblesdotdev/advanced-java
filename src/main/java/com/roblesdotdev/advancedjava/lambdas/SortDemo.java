package com.roblesdotdev.advancedjava.lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class SortDemo {
    public static void main(String[] args) {
        String[] words = new String[3];
        words[0] = "first";
        words[1] = "second";
        words[2] = "latest 1";

        System.out.println("Before sort");
        Arrays.stream(words).forEach(System.out::println);
        System.out.println("After sort");
        Arrays.sort(words, Comparator.comparingInt(String::length));
        Arrays.stream(words).forEach(System.out::println);

    }
}
