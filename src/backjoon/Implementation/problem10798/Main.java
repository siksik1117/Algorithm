package backjoon.Implementation.problem10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15];
        int max = 0;

        for(int i =0; i <5; i++) {
            String line = br.readLine();
            max = Math.max(max, line.length());
            for(int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j);
            }
        }
        String answer = "";
        for(int i = 0; i < max; i++) {
            for(int j = 0; j < 5; j++) {
                if(arr[j][i] != '\0') {
                    answer+= arr[j][i];
                }
            }
        }
        System.out.println(answer);
    }

}
