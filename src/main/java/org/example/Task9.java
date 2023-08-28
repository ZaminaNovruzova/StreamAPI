package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        //Bir massivdəki elementlərin kubların cəmini tapın
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Integer kublarinCemi = numbers.stream().map(a -> a * a * a).reduce(0, (a, b) -> a + b);
        System.out.println(kublarinCemi);
    }
}
