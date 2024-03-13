package backjoon.level3.problem25304;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            cnt += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        if (a == cnt) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
