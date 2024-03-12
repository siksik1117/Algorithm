package backjoon.level2.problem2884;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if ( b < 45) {
            a--;
            b = 60 - (45 - b);
            if(a < 0 ) {
                a = 23;
            }
        } else {
            b = b -45;
        }
        System.out.println(a + " " + b);
    }
}
