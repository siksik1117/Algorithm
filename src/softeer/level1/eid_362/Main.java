package softeer.level1.eid_362;

import java.util.*;
import java.io.*;


public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tot = Integer.parseInt(br.readLine());
        for(int i = 1; i <= tot; i++) {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int sum = a + b;
            System.out.println("Case #" + i + ": " + sum);
        }
    }
}