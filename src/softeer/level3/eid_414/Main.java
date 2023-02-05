package softeer.level3.eid_414;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[] line = new char[N];
        line = br.readLine().toCharArray();

        int count = 0;

        for(int i = 0; i < N; i++) {
            if(line[i] == 'P') {
                for(int j = i-K; j < i+K+1; j++) {
                    if(j < 0 || j >= N) {
                        continue;
                    }
                    else if (line[j] == 'H') {
                        count++;
                        line[j] = '0';
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
