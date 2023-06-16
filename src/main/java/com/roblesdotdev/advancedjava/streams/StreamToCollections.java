package com.roblesdotdev.advancedjava.streams;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToCollections {
    public static void main(String[] args) {
        Stream<String> words =  Stream.of("one", "two", "two", "three");

        // With collectors
        // List<String> wordsList = words.collect(Collectors.toList());
        Set<String> wordsList = words.collect(Collectors.toSet());

        wordsList.forEach(System.out::println);

        // To Map

    }
}
