package backjoon.level4.problem10807;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        int cnt = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int b = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            if (b == arr[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
