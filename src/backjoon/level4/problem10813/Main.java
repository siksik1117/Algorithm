package backjoon.level4.problem10813;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for(int i = 0; i < N ; i++) {
            arr[i] = i+1;
        }

        for(int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;

            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }

        for(int k : arr) {
            System.out.print(k + " ");
        }

    }
}
