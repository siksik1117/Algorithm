package backjoon.level6.problem3003;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] tmp = {1, 1, 2, 2, 2, 8};
        String[] arr = br.readLine().split(" ");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(tmp[i] - Integer.parseInt(arr[i]) + " ");
        }
    }
}
