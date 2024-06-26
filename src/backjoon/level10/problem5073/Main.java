package backjoon.level10.problem5073;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     while (true) {
         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());
         int c = Integer.parseInt(st.nextToken());
         if(a == 0 && b == 0 && c ==0) {
             break;
         }
         if(a == b && b == c) {
             System.out.println("Equilateral");
         } else if (a+b <= c || b+c <= a || a+c <= b) {
             System.out.println("Invalid");
         } else if (a != b && b != c && a != c){
             System.out.println("Scalene");
         } else {
             System.out.println("Isosceles");
         }
     }
     br.close();
    }
}
