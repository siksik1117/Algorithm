package backjoon.level7.problem10798;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[15][15];

        for(int i = 0; i < 5; i++) {
            String a = br.readLine().toString();
            for(int j = 0; j < 15; j++) {
                if(j < a.length()) {
                    arr[i][j] = a.charAt(j);
                } else {
                    arr[i][j] = '!';
                }
            }
        }

        String ans = "";

        for(int j = 0; j < 15; j++) {
            for(int i = 0; i < 5; i++) {
                if(arr[i][j] != '!') {
                    ans += arr[i][j];
                }
            }
        }
        System.out.println(ans);
    }
}
