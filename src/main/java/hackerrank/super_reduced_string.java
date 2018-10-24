package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class super_reduced_string {

    static String super_reduced_string(String s){
      	StringBuilder sb = new StringBuilder(s);
        String result = "Empty String";
		for(int i=0;i<sb.length()-1;i++) {
			if(sb.charAt(i)==sb.charAt(i+1)) {
				sb.deleteCharAt(i);
				sb.deleteCharAt(i);
				i=-1;
			}
		}
		if(sb.length()>0) result = sb.toString();
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
