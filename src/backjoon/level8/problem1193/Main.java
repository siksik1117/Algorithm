package backjoon.level8.problem1193;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int b = 2;
        int cnt = 1;
        while (true) {
            if (a == 1) {
                break;
            } else if(b <= a && a <= b + cnt) {
                break;
            }
            cnt++;
            b += cnt;
        }

        int c = 0;
        for(int i = b; i <= b+cnt; i++) {
            if (a == 1) {
                System.out.println("1/1");
                break;
            }else if(a == i) {
                if((cnt +1) % 2 == 0) {
                    System.out.println((1 + c) + "/" + (cnt + 1 - c));
                } else {
                    System.out.println((cnt + 1 - c) + "/" + (1 + c));
                }
                break;
            }
            c++;
        }
    }
}
