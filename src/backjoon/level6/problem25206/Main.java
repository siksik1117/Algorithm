package backjoon.level6.problem25206;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Double cnt = 0.0;
        Double sum = 0.0;
        for(int i = 0; i < 20; i++) {
            String[] arr = br.readLine().split(" ");

            Double score = 0.0;
            switch(arr[2]) {
                case "A+": score = 4.5; break;
                case "A0": score = 4.0; break;
                case "B+": score = 3.5; break;
                case "B0": score = 3.0; break;
                case "C+": score = 2.5; break;
                case "C0": score = 2.0; break;
                case "D+": score = 1.5; break;
                case "D0": score = 1.0; break;
            }
            if(arr[2].equals("P")) {
            } else {
                sum += Double.parseDouble(arr[1]);
                cnt += Double.parseDouble(arr[1]) * score;
            }
        }
        System.out.println(cnt / sum);
    }
}
