package hackerrank;
import java.util.Scanner;

public class camelcases {

    static int camelcase(String s) {
		int count = 1;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(65<=c && c<=90) {
				count++;
			}
		}
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}
