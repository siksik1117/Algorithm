package softeer.level3.eid_394;

import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] temp = br.readLine().split(" ");
        int[] weight = new int[N];
        for(int i = 0; i < temp.length; i++) {
            weight[i] = Integer.parseInt(temp[i]);
        }

        int[][] L = new int[M][2];
        for(int i = 0; i < M; i++) {
            temp = br.readLine().split(" ");
            for(int j = 0; j < 2; j++) {
                L[i][j] = Integer.parseInt(temp[j]);
            }
        }

        int[] cnt = new int[N+1];
        for(int i = 1; i < N+1; i++) {
            cnt[i] = 1;
        }
        cnt[0] = 0;

        for(int i = 0; i < M; i++) {
            if(weight[L[i][0] -1] > weight[L[i][1] -1]) {
                cnt[L[i][1]] = 0;
            } else if (weight[L[i][0] -1] < weight[L[i][1] -1]) {
                cnt[L[i][0]] = 0;
            } else {
                cnt[L[i][0]] = 0;
                cnt[L[i][1]] = 0;
            }
        }
        int count = 0;
        for(int i = 1; i < N+1; i++) {
            if(cnt[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
