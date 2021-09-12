package com.company.hackerrank.problemsolving;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String time = "";
        try {
            DateFormat in = new SimpleDateFormat("hh:mm:ssa");
            DateFormat out = new SimpleDateFormat("HH:mm:ss");
            Date date = in.parse(s);
            time = out.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return time;
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        String outputFileName = "time.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFileName));

        String s = bufferedReader.readLine();

//        String result = Result.timeConversion(s);
        String result = Result.timeConversion(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
