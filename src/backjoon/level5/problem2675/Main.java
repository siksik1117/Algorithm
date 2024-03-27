package backjoon.level5.problem2675;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int b = Integer.parseInt(st.nextToken());
            String c = st.nextToken().toString();

            for( String s : c.split("")) {
                for(int k = 0; k < b; k++) {
                    System.out.print(s);
                }
            }
            System.out.println();
        }
    }
}
