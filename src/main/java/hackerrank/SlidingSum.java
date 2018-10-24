package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SlidingSum {

    static int solve(int n, int[] s, int d, int m){
        int slidingSum = 0;
        int count = 0;
        int resultCount = 0;
        for(int temp : s){
            slidingSum += temp;
            count++;
            if(count>=m) {
                if(d==slidingSum) {
                    resultCount++;
                }
                slidingSum -= s[count-m];                    
            }
        }
        return resultCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
