package softeer.level2.eid_407;

import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long K = Integer.parseInt(st.nextToken());
        long P = Integer.parseInt(st.nextToken());
        long N = Integer.parseInt(st.nextToken());

        long answer = K;

        for(int i = 0; i < N; i++) {
            answer = (answer * P) % 1000000007;
        }
        System.out.println(answer);
    }
}
