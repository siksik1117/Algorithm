package backjoon.level5.problem11720;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine().toString();

        int ans = 0;
        String[] arr = b.split("");

        for(int i = 0; i < arr.length; i++) {
            ans+= Integer.parseInt(arr[i]);
        }

        System.out.println(ans);
    }
}
