package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        // Bir String massivdəki (list) Stringləri birləşdirmək
        List<String> words = List.of("Java", "Stream", "API");
        String birlesdirilmisString = words.stream().collect(Collectors.joining(" "));
        System.out.println("Birlesdirilmis String: " + birlesdirilmisString);
    }
}
