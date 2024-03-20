package backjoon.level4.problem10871;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[a];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < a; i++) {
            if(arr[i] < b) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
