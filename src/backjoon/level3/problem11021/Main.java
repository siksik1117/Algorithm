package backjoon.level3.problem11021;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());

        for(int i = 1; i <= a; i++ ) {
            st = new StringTokenizer(br.readLine(), " ");
            System.out.println("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
        }
    }
}
