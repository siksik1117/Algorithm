package backjoon.level6.problem1157;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine().toUpperCase();
        int[] arr = new int[26];
        int max = 0;
        char ans = '?';

        for(int i = 0; i < a.length(); i++) {
            int idx = a.charAt(i) - 'A';
            arr[idx]++;
            if(max < arr[idx]) {
                max = arr[idx];
                ans = a.charAt(i);
            } else if (max == arr[idx]) {
                ans = '?';
            }
        }
        System.out.println(ans);
    }
}
