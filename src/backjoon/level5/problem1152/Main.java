package backjoon.level5.problem1152;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine().toString();

        String[] arr = a.split(" ");
        int ans = arr.length;

        for(String s : arr) {
            if(s.equals("")) {
                ans--;
            }
        }
        System.out.println(ans);

    }
}
