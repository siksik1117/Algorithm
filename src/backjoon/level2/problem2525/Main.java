package backjoon.level2.problem2525;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        if(b + c >= 60) {
            a = a + ((b + c) / 60);
            b = (b + c) % 60;
            if(a >= 24) {
                a = a - 24;
            }
        } else {
            b = b + c;
        }
        System.out.println(a + " " + b);
    }
}
