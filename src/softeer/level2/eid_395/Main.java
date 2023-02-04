package softeer.level2.eid_395;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] metal = new int[N][2];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            metal[i][0] = Integer.parseInt(st.nextToken());
            metal[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(metal, (x,y) -> {       //가격 역순으로 정렬
            return y[1] - x[1];
        });

        int result = 0;

        for(int i = 0; i < metal.length; i++) {
            if(W > metal[i][0]) {
                result += metal[i][0] * metal[i][1];
                W -= metal[i][0];
            } else {
                result += W * metal[i][1];
                break;
            }
        }
        System.out.println(result);
    }
}
