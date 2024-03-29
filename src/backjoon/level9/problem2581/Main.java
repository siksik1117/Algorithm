package backjoon.level9.problem2581;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 0;
        for(int i = a; i <= b; i++) {
            int cnt = 0;
            for(int j = 2; j <= i; j++) {
                if( i % j == 0) {
                    cnt++;
                }
            }
            if(cnt == 1) {
                if(min == 0) {
                    min = i;
                }
                sum+= i;
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
