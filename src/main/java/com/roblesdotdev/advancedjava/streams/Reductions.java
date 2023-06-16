package com.roblesdotdev.advancedjava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Reductions {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.add("Samuel");

        // count -> number of stream elements
        long countValidNames = names.stream().filter(n -> n.length() > 4).count();

        System.out.println("Valid names: " + countValidNames);

        // max/min -> largest or smallest stream element
        Optional<String> maxName = names.stream().max(String::compareToIgnoreCase);

        System.out.println("Max name: " + maxName);

        // findFirst yield the first element
        Optional<String> firstM = names.stream().filter(n -> n.startsWith("M")).findFirst();

        System.out.println("First m: " + firstM);
    }
}
