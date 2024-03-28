package backjoon.level8.problem2292;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int cnt = 1;
        int b = 1;
        while(true) {
            if(a == 1) {
                break;
            } else if(a >= b && a <= b + (6 * cnt)) {
                cnt++;
                break;
            }
            b = b + (6 * cnt);
            cnt++;
        }
        System.out.println(cnt);
    }
}
