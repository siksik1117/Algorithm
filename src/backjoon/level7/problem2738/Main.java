package backjoon.level7.problem2738;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] arr = new int[a][b];
        int[][] arr2 = new int[a][b];

        for(int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < b; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < b; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
