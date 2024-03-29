package backjoon.level9.problem1978;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;

        for(int i = 0; i < a; i++) {
            int b = Integer.parseInt(st.nextToken());
            if (b != 1 || b != 2) {
                int cnt2 = 0;
                for(int j = 2; j <= b; j++) {
                    if(b % j == 0 ) {
                        cnt2++;
                    }
                }
                if(cnt2 == 1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
