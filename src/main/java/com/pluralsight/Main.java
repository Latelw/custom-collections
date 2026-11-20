package com.pluralsight;

import com.pluralsight.collection.FixedList;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(134);
        System.out.println(numbers.getItems());
        System.out.println(numbers.getItems().size());

        numbers.add(132);
        numbers.add(13);
        numbers.add(32);
        FixedList<LocalDate> dates = new FixedList<>(3);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(LocalDate.now().minusDays(12));
        System.out.println(dates.getItems());
        System.out.println(dates.getItems().size());
        System.out.println(numbers.getItems().size());
        System.out.println(numbers.getItems());

    }
}
