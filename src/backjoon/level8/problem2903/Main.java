package backjoon.level8.problem2903;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int n = 2;
        for(int i = 0; i < a; i++) {
            n = (n * 2) -1;
        }
        System.out.println(n * n);
    }
}
