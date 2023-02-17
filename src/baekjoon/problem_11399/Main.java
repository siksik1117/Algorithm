package baekjoon.problem_11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] human = new int[N];
        for(int i = 0; i < N; i++) {
            human[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(human);

        int prev = 0;
        int sum = 0;

        for(int i = 0 ; i < N; i++) {
            sum+= prev + human[i];
            prev+= human[i];
        }
        System.out.println(sum);
    }
}
