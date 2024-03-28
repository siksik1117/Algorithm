package backjoon.level8.problem2720;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i < a; i++) {
            int b = Integer.parseInt(br.readLine());
            int c = b - (b / 25) * 25;
            int d = c - (c / 10) * 10;
            int e = d - (d / 5) * 5;
            System.out.println(b / 25 + " " + c / 10 +  " " + d / 5 + " " + e / 1);
        }
    }
}
