package backjoon.level3.problem25314;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String ans = "";
        for(int i = 0; i < a/4; i++) {
            ans += "long ";
        }
        System.out.println(ans + "int");
    }
}
