package com.mprog.practice.task3;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*todo persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
                      // and 4 has only one digit
       persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
                       // 1*2*6 = 12, and finally 1*2 = 2
       persistence(4) == 0 // because 4 is already a one-digit number
 */
public class Persist {

    public static void main(String[] args) {
        System.out.println(persistence(4));
    }

    public static int persistence(long n) {
        List<Long> integers;
        int counter = 0;
        long sum;
        while (n > 9){
            sum = 1;
            integers = divideNN(n);
            for (Long integer : integers) {
                sum *= integer;
            }
            n = sum;
            counter++;
        }

        return counter;
    }

    private static List<Long> divideNN(long n) {
        return Arrays.stream(String.valueOf(n).split(""))
                .map(Long::valueOf)
                .collect(Collectors.toList());
    }
}
