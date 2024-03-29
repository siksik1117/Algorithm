package backjoon.level9.problem9506;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringBuffer sb = new StringBuffer();
            int a = Integer.parseInt(br.readLine());
            if(a == -1) {
                break;
            }
            int b = 0;
            sb.append(a + " = ");
            for(int i = 1; i < a; i++) {
                if(a % i == 0) {
                    sb.append(i + " + ");
                    b+= i;
                }
            }

            if(a == b) {
                System.out.println(sb.substring(0, sb.length()-2));
            } else {
                System.out.println(a + " is NOT perfect.");
            }
        }
    }
}
