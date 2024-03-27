package backjoon.level5.problem27866;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine().toString();
        int b = Integer.parseInt(br.readLine());

        System.out.println(a.charAt(b-1));
    }
}
