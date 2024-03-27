package backjoon.level6.problem2444;

import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for(int i = 1; i <= a; i++) {
            for(int j = 0; j < a-i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = a-1; i >= 0; i--) {
            for(int j = 0; j < a-i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
