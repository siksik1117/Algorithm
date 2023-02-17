package baekjoon.problem_1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            String st = br.readLine();
            boolean[] check = new boolean[26];
            boolean flag = true;

            for(int j = 0; j < st.length(); j++) {
                int index = st.charAt(j) - 'a';
                if(check[index]) {
                    if(st.charAt(j)!= st.charAt(j-1)) {
                        flag = false;
                        break;
                    }
                } else {
                    check[index] = true;
                }
            }
            if(flag) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
