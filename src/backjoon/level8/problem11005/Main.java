package backjoon.level8.problem11005;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuffer sb = new StringBuffer();
        while ( a != 0) {
            if( a % b >= 10) {
              sb.append((char) ((a % b) + 55));
            } else {
                sb.append(a % b);
            }
            a /= b;
        }
        System.out.println(sb.reverse().toString());
    }
}
