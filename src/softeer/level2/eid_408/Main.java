package softeer.level2.eid_408;

import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr = br.readLine();

        String asc = "1 2 3 4 5 6 7 8";
        String desc = "8 7 6 5 4 3 2 1";

        if(arr.equals(asc)) {
            System.out.println("ascending");
        } else if (arr.equals(desc)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
