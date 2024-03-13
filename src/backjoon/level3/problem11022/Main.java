package backjoon.level3.problem11022;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());
        int b, c;

        for(int i = 1; i <= a; i++ ) {
            st = new StringTokenizer(br.readLine(), " ");
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            System.out.println("Case #" + i + ": " + b + " + " + c + " = " + ( b + c ));
        }
    }
}