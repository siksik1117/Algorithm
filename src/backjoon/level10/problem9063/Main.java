package backjoon.level10.problem9063;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int[] x = new int[a];
        int[] y = new int[a];

        for(int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(x);
        Arrays.sort(y);

        System.out.println((x[a-1] - x[0]) * (y[a-1] - y[0]));
    }
}
