package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        //1.Listdeki Stringleri uzunluguna gore siralayin
        List<String> words = new ArrayList<>();
        words.add("pomidor");
        words.add("alma");
        words.add("gilas");
        words.add("moruq");
        words.add("qaragat");
        List<String> list = words.stream().sorted((element1, element2) -> Integer.compare(element1.length(), element2.length())).collect(Collectors.toList());
        System.out.println(list);
    }
}
