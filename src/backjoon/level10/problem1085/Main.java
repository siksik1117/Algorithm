package backjoon.level10.problem1085;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[4];
        int x = 0;
        int y = 0;
        for(int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        x = Math.min(Math.abs(0 - arr[0]), Math.abs(arr[2] - arr[0]));
        y = Math.min(Math.abs(0 - arr[1]), Math.abs(arr[3] - arr[1]));

        System.out.println(Math.min(x, y));
    }
}
