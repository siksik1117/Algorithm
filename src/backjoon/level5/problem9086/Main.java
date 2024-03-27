package backjoon.level5.problem9086;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i < a; i++) {
            String b = br.readLine().toString();

            System.out.println(String.valueOf(b.charAt(0)) + String.valueOf(b.charAt(b.length()-1)));
        }
    }
}
