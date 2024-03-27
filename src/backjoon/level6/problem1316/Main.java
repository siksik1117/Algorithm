package backjoon.level6.problem1316;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i = 0; i < a; i++) {
            String b = br.readLine();

            int[] arr = new int[26];
            boolean check = true;

            for(int j = 0; j < b.length(); j++) {
                int tmp = b.charAt(j) - 'a';
                if (arr[tmp] == 1) {
                    if(b.charAt(j) != b.charAt(j-1)) {
                        check = false;
                        break;
                    }
                } else {
                    arr[tmp] = 1;
                }
            }
            if(check) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
