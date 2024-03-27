package backjoon.level6.problem2941;

import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String a = br.readLine();
        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            if(a.contains(arr[i])) {
                a = a.replace(arr[i], "0");
            }
        }
        System.out.println(a.length());
    }
}
