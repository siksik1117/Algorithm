package backjoon.level5.problem2908;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");

        StringBuffer sb = new StringBuffer(a[0]);
        String b = sb.reverse().toString();
        sb = new StringBuffer(a[1]);
        String c = sb.reverse().toString();

        if(Integer.parseInt(b) > Integer.parseInt(c)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
