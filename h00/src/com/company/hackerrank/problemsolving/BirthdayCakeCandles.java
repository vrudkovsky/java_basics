package com.company.hackerrank.problemsolving;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/***
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 */

class Resultv1 {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int Solutionv1(List<Integer> candles) {
        // Write your code here
        int max = candles.stream().max(Integer::compareTo).get();
        return (int) candles.stream().filter(x -> x == max).count();
    }

}

public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {
        String outputFileName = "candels.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFileName));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Resultv1.Solutionv1(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
