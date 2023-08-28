package org.example;

import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        //Bir massivdəki elementlərin cəmlənməsi
        List<Integer> integers=List.of(3,4,5,6,9,12);
        int sum=integers.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum: "+sum);

    }
}
