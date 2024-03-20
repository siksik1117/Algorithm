package backjoon.level4.problem5597;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[31];

        for(int i = 1; i < 29; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[a] = 1;
        }

        for(int j = 1; j < arr.length; j++) {
            if(arr[j] != 1) {
                System.out.println(j);
            }
        }
    }
}
