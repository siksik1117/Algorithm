package backjoon.level9.problem2501;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for(int i = 1; i <= a; i++) {
            if(a % i == 0) {
                cnt++;
                if(b == cnt) {
                    System.out.println(i);
                }
            }
        }

        if(cnt < b) {
            System.out.println(0);
        }
    }
}
