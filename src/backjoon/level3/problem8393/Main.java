package backjoon.level3.problem8393;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i = 1; i <= a; i++) {
            cnt+= i;
        }
        System.out.println(cnt);
    }
}
