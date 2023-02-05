package softeer.level2.eid_413;

import java.util.*;
import java.io.*;

public class Main
{
    static int n;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        int width = 2;

        for(int i = 0; i < n; i++) {
            width = (width * 2) - 1;
        }
        System.out.println(width * width);
    }
}
