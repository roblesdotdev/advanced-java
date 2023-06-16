package com.roblesdotdev.advancedjava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// Streams are immutables: all operations yield new streams or results.

// filter(Predicate<T>) -> Stream<T>

// map(Function<T, U>) -> Stream<U>

public class Transformations {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John Doe");
        names.add("Mary Jane");
        names.add(".");

        // Filter
        Stream<String> filtered = names.stream().filter(n -> n.length() > 3);

        // Filter + Map
        Stream<String> mapped = names.stream()
                .filter(n -> n.length() > 3)
                .map(n -> "Name: " + n);

        names.forEach(System.out::println);
        filtered.forEach(System.out::println);
        mapped.forEach(System.out::println);
    }
}
