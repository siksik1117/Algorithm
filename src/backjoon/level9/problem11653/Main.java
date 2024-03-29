package backjoon.level9.problem11653;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i = 2; i <= a; i++) {
            while (true) {
                if (a % i != 0) {
                    break;
                }
                a /= i;
                System.out.println(i);
            }
        }
    }
}
