package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        //String  listdəki stringləri böyük hərflərə çevirin
        List<String> strings = List.of("this", "is", "lower", "case");
        List<String> uppercase = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercase);
    }
}
