package backjoon.level4.problem2562;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        for(int i = 1; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int index = 0;

        for(int j = 1; j < 10; j++) {
            if(arr[j] > max) {
                max = arr[j];
                index = j;
            }
        }

        System.out.print(max + "\n" + index);
    }
}
