package com.roblesdotdev.advancedjava.streams;

import java.util.ArrayList;
import java.util.List;

public class IteratingToStreams {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");

        // Classic iteration
        int count1 = 0;
        for (String word : words) {
            if (word.length() > 4) count1++;
        }

        System.out.println("The count1 is " + count1);

        // With streams
        long count2 = words.stream()
                .filter(w -> w.length() > 4)
                .count();
        System.out.println("The count2 is " + count2);
    }
}
