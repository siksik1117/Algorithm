package softeer.level2.eid_409;

import java.util.*;
import java.io.*;
public class Main
{
    static int n;
    static int[][] map;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        for(int i = 0; i < n; i++) {
            char[] line = br.readLine().toCharArray();
            for(int j = 0; j < n; j++) {
                if(line[j] == '1') {
                    map[i][j] = 1;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(map[i][j] == 1) {
                    int cnt = search(i, j);
                    result.add(cnt);
                }
            }
        }
        Collections.sort(result);

        System.out.println(result.size());
        for(int k = 0; k < result.size(); k++) {
            System.out.println(result.get(k));
        }

    }
    public static int search(int i, int j) {
        if(map[i][j] != 1) {
            return 0;
        } else {
            int count = 1;

            map[i][j] = 0;
            if(i > 0) {
                count+= search(i-1, j);
            }
            if(i < n - 1) {
                count+= search(i+1, j);
            }
            if(j > 0) {
                count+= search(i, j-1);
            }
            if(j < n -1) {
                count+= search(i, j+1);
            }
            return count;
        }
    }
}
