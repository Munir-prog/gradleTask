package com.mprog.practice.task1;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Words {
    public static void main(String[] args) {
        var strings = List.of("88", "11", "22", "33", "44", "55", "66", "77", "99");
        strings.stream()
                .map(Words::concatenateStrings)
                .map(Integer::valueOf)
                .filter(Words::filterIntegers)
//                .sorted()
//                .skip(1)
                .limit(2)
                .forEach(System.out::println);

//        var integerList = IntStream.range(0, 1000)
//                .map(value -> value + value)
//                .filter(Words::filterIntegers)
//                .peek(System.out::println)
//                .boxed()
//                .collect(Collectors.toList());
//        integerList.stream()
//                .forEach(System.out::println);
//

        IntStream.iterate(0, value -> value + 3)
                .skip(10)
                .limit(20)
                .forEach(System.out::println);
    }

    public static String concatenateStrings(String value){
        return value+value;
    }

    public static boolean filterIntegers(Integer value){
        return value % 2 == 0;
    }
}
