package softeer.level3.eid_390;

import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] temp = br.readLine().split(" ");
        int[] list = new int[N];
        int[] result = new int[N];
        for(int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(temp[i]);
            result[i] = 1;
        }

        for(int i = 1; i < N; i++) {
            int list_max = 0;
            for(int j = 0; j < i; j++) {
                if(list[i] > list[j]) {
                    if(list_max < result[j]) {
                        list_max = result[j];
                    }
                }
            }
            result[i] = list_max +1;
        }
        int max = result[0];
        for(int i = 0; i < result.length; i++) {
            if(result[i] > max) {
                max = result[i];
            }
        }
        System.out.println(max);
    }
}