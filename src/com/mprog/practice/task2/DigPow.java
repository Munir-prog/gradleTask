package com.mprog.practice.task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.Math.pow;

public class DigPow {

    public static void main(String[] args) {
        var s = digPow(92, 1);
        System.out.println(s);
    }

    /*todo
       digPow(89, 1) should return 1 since 8¹ + 9² = 89 = 89 * 1
       digPow(92, 1) should return -1 since there is no k such as 9¹ + 2² equals 92 * k
       digPow(695, 2) should return 2 since 6² + 9³ + 5⁴= 1390 = 695 * 2
       digPow(46288, 3) should return 51 since 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
    */
    public static long digPow(int n, int p) {
        var integers = divideNN(n);
        var size = integers.size();
        int sum = 0;
        int a;
        for (Integer integer : integers) {
            a = integer;
            sum += (int) pow(a, p);
            p++;
        }
        int result = sum / n;
        if (result * n == sum) {
            return result;
        } else {
            return -1;
        }
    }

    private static List<Integer> divideNN(int n) {
        return Arrays.stream(String.valueOf(n).split(""))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }
}
