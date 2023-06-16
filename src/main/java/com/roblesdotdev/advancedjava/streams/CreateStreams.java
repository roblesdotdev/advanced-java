package com.roblesdotdev.advancedjava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.add("Sam");

        // Any collection into stream
        Stream<String> namesStream = names.stream();

        // Any array into stream
        String[] careers = new String[] {
                "First",
                "Second",
                "Third",
        };
        Stream<String> careersStream = Stream.of(careers);

        // Varargs
        Stream<Integer> nums = Stream.of(1, 2, 3, 4, 5);

        // Empty stream
        Stream<String> empty = Stream.empty();

        namesStream.forEach(System.out::println);
        careersStream.forEach(System.out::println);
        nums.filter(n -> n % 2 == 0).forEach(System.out::println);

        // Infinite
        Stream<Double> rands = Stream.generate(Math::random).limit(10);

        rands.forEach(System.out::println);

    }
}
