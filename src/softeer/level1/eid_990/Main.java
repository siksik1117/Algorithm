package softeer.level1.eid_990;

import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int sum = 0;
        for(int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            String[] a = st.nextToken().split(":");
            String[] b = st.nextToken().split(":");

            sum+= (Integer.parseInt(b[0]) * 60 + Integer.parseInt(b[1])) - (Integer.parseInt(a[0]) * 60 + Integer.parseInt(a[1]));
        }
        System.out.println(sum);
    }
}