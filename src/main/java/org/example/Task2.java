package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task2 {
    public static void main(String[] args) {
        //Example 1 : Mətndəki sözləri olcusu 4den yuxari olanlari filtrləmək
        String text = "Java is a platform independent language ";
       List<String> words=List.of(text.split(" "));
       List<String> filteredWords=words.stream().filter(word->word.length()>4).collect(Collectors.toList());
       filteredWords.stream().forEach(System.out::println);

       



    }
}
