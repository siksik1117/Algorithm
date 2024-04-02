package backjoon.level10.problem3009;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        String[] c = br.readLine().split(" ");

        int x = 0;
        int y = 0;
        for(int i = 0; i < 2; i++) {
            if(a[i].equals(b[i])) {
                System.out.print(c[i]);
            } else if (a[i].equals(c[i])) {
                System.out.print(b[i]);
            } else {
                System.out.print(a[i]);
            }
            System.out.print(" ");
        }
    }
}
