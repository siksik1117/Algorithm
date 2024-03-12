package backjoon.level2.problem2480;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if( a == b && b == c) {
            System.out.println(10000 + (a * 1000));
        } else if ( a == b && b != c) {
            System.out.println(1000 + (a * 100));
        } else if ( a == c && b != c) {
            System.out.println(1000 + (a * 100));
        } else if ( b == c && a != c) {
            System.out.println(1000 + (b * 100));
        } else {
            System.out.println(Math.max(Math.max(a, b), c) * 100);
        }
    }
}
