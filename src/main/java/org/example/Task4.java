package org.example;

import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        Stream<Integer> values = Stream.of(4, 15, 8, 7, 9, 10);
        Stream<Integer> sortedStream = values.sorted();
        sortedStream.forEach(System.out::println);

    }
}
