package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //yasi 20den yuxari olan sexslerin melumatlarini Listden getirmek
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Zamina", 22));
        personList.add(new Person("Ali", 24));
        personList.add(new Person("Aytac", 20));

        List<Person> persons = personList.stream().filter(person -> person.getAge() > 20).collect(Collectors.toList());
        System.out.println(persons);
        //Listdeki insanlarin yasini 5 yas artirmaq
        List<Person> people = personList.stream().map(person -> new Person(person.getName(), person.getAge() + 5)).collect(Collectors.toList());
        System.out.println(people);
    }
}