package softeer.level2.eid_623;

import java.util.*;
import java.io.*;

public class Main {


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        String[] secret = br.readLine().split(" ");
        String[] arr = br.readLine().split(" ");;

        String answer = "normal";

        for(int i = 0; i < N; i++) {
            boolean flag;
            if(arr[i].equals(secret[0])) {
                flag = true;
                for(int j = 1; j < M; j++) {
                    if(i + j >= N) {
                        flag = false;
                    } else if (!arr[i+j].equals(secret[j])) {
                        flag = false;
                    }
                }
                if(flag) {
                    answer = "secret";
                }
            }
        }
        System.out.println(answer);
    }
}
