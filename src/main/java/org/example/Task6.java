package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        //Listdeki ededlerin tek ve cut olaraq qruplasdirilmasi
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,89,12,13,14,18);
        List<Integer> evenNumbers=numbers.stream().filter(a->a%2==0).collect(Collectors.toList());
        List<Integer> oddNumbers=numbers.stream().filter(a->a%2!=0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
    }
}
