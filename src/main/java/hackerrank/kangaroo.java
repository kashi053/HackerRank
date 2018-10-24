package hackerrank;
import java.util.Scanner;

public class kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        
        if(x1<x2 && v1<=v2) {
            return "NO";
        }
        if(x1>x2 && v1>=v2) {
            return "NO";
        }
        int index = 0;
        String minSide = x1 < x2 ? "dist1":"dist2";
        while(true) {
        	int dist1 = (index*v1)+x1;
        	int dist2 = (index*v2)+x2;
        	if(dist1 == dist2) {
        		return "YES";
        	}
        	if("dist1".equalsIgnoreCase(minSide) && dist1>dist2) break;
        	if("dist2".equalsIgnoreCase(minSide) && dist2>dist1) break;
        	index++;
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
