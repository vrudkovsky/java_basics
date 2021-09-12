package com.company.hackerrank.problemsolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Resultv5 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
//        long max = arr.stream().mapToLong(v -> v).max().orElse(Integer.MAX_VALUE);
//        long min = arr.stream().mapToLong(v -> v).min().orElse(Integer.MIN_VALUE);
        long minSum = arr.stream().mapToLong(v -> v).sorted().limit(arr.size() - 1).sum();
        long maxSum = arr.stream().mapToLong(v -> v).sorted().skip(1).sum();
        System.out.printf("%d %d", minSum, maxSum);
    }

}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Resultv5.miniMaxSum(arr);

        bufferedReader.close();
    }
}
