package backjoon.level7.problem2566;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[9][9];

        for(int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = arr[0][0];
        int x = 1;
        int y = 1;
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(max < arr[i][j]) {
                    max = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
