package backjoon.level4.problem10818;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = arr[0];
        int min = arr[0];
        for(int j = 0; j < a-1; j++) {
            max = Math.max(max, arr[j + 1]);
            min = Math.min(min, arr[j + 1]);
        }

        System.out.println(min + " " + max);
    }
}
