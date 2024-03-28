package backjoon.level8.problem2745;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String a = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int idx = 0;
        int num = 0;
        int ans = 0;

        for(int i = a.length()-1; i >= 0; i--) {
            char c = a.charAt(i);
            if(c >= '0' && c <= '9') {
                num = c - '0';
            } else {
                num = c - 55;
            }
            ans += num * Math.pow(b, idx++);
        }
        System.out.println(ans);
    }
}
