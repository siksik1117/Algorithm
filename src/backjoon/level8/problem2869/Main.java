package backjoon.level8.problem2869;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int cnt = (v - a) / (a - b);
        if((v - a) % (a - b) != 0) {
            cnt++;
        }
        System.out.println(cnt + 1);
    }
}
