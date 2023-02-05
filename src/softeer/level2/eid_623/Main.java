package softeer.level2.eid_623;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] limit = new int[101];
        int k = 0;

        for(int i = 0; i < N; i++) {
            String[] line_N = br.readLine().split(" ");
            for(int j = k+1; j < k + Integer.parseInt(line_N[0])+1; j++) {
                limit[j] = Integer.parseInt(line_N[1]);
            }
            k += Integer.parseInt(line_N[0]);
        }

        int[] spped = new int[101];
        k = 0;

        for(int i = 0; i < M; i++) {
            String[] line_N = br.readLine().split(" ");
            for(int j = k+1; j < k + Integer.parseInt(line_N[0])+1; j++) {
                spped[j] = Integer.parseInt(line_N[1]);
            }
            k += Integer.parseInt(line_N[0]);
        }

        int result = 0;

        for(int i = 0; i < 101; i++) {
            result = Math.max(result, spped[i] - limit[i] );
        }
        System.out.println(result);
    }
}
