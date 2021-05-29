package com.mprog.practice.task1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
//        taskOne();
//        taskTwo();
//        taskTwoElse();
//        taskThree();
        taskFour();
    }

    private static void taskFour() {
        var integerList = List.of(5, 2, 4, 2, 1);
        var collect = integerList.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
        System.out.println(collect);
    }

    private static void taskThree() {
        var wordMap = Map.of("word7", 5,
                "word6", 6,
                "disticnrd", 82,
                "another", 22,
                "word8", 4);

        var sum = wordMap.entrySet()
                .stream()
                .filter(value -> value.getKey().length() < 7)
                .map(Map.Entry::getValue)
                .reduce(0, Integer::sum);
//                .mapToInt(Map.Entry::getValue)
//                .sum();
        System.out.println(sum);
    }

    private static void taskTwoElse() {
        var stringList = List.of("Hello", "What", "concatinating", "do", "helloworld", "helloworld", "hierarichal", "amd");
        var stringSetSize = stringList.stream()
                .filter(value -> value.length() > 8)
                .distinct()
                .count();
        System.out.println(stringSetSize);
    }

    private static void taskTwo() {
        var stringList = List.of("Hello", "What", "concatinating", "do", "helloworld", "helloworld", "hierarichal", "amd");
        var stringSetSize = stringList.stream()
                .filter(value -> value.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(stringSetSize);
    }

    private static void taskOne() {
        var integerList = List.of(1, 3, 4, 6, 8, 5, 15, 20, 25, 10);
        integerList.stream()
                .filter(value -> value % 2 != 0)
                .filter(value -> value % 5 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);
    }
}
