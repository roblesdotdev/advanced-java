package com.roblesdotdev.advancedjava.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TaskSorter {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "Run away from killer rabbit", 4));
        tasks.add(new Task(2, "Answer the bridgekeeper", 2));
        tasks.add(new Task(3, "Defeat the black knight", 1));
        tasks.add(new Task(4, "Give a shrubbery to the knights who say Ni!", 4));
        tasks.add(new Task(5, "Lobbed thou thy holy hand grands", 3));

        System.out.println("Tasks before sort");
        tasks.forEach(System.out::println);
        Collections.sort(tasks);
        System.out.println("Tasks after sort");
        tasks.forEach(System.out::println);

    }
}
