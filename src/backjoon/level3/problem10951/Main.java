package backjoon.level3.problem10951;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while ( (str=br.readLine()) != null ) {
            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(a + b);
        }
    }
}
