package backjoon.level4.problem1546;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Double[] arr = new Double[a];

        for(int i = 0; i < a; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        Double max = new Double(0);
        for(int j = 0; j < a; j++) {
            max = Math.max(max, arr[j]);
        }

        Double sum = new Double(0);
        for(int k = 0; k < a; k++) {
            if(arr[k] != 0) {
                sum+= (arr[k] / max) * 100;
            }
        }

        System.out.println(sum / a);
    }
}
