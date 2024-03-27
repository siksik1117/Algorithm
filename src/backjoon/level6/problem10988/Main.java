package backjoon.level6.problem10988;

import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        StringBuffer sb = new StringBuffer(a);
        String b = sb.reverse().toString();

        System.out.println(a.equals(b) ? 1 : 0);
    }
}
