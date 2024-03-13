package backjoon.level3.problem10950;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        }
    }

}
