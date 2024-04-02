package backjoon.level10.problem14215;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int[] arr2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(arr2);

        if(arr2[0] + arr2[1] <= arr2[2]) {
            System.out.println((arr2[0] + arr2[1]) * 2 - 1);
        } else {
            System.out.println(arr2[0] + arr2[1] + arr2[2]);
        }
    }
}

