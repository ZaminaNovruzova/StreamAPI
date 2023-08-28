package org.example;

import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        //Double arrayda  3 dən böyük elementlərin streamini qaytarır.
        Double[] elements = {3.0, 4.5, 6.7, 2.3};
        Stream<Double> stream = Stream.of(elements);

        stream.filter(e->e > 3 )
                .forEach(System.out::println);

    }
}
