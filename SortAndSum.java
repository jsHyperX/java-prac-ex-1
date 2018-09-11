import java.io.*;
import java.util.*;

public class SortAndSum {

    public static void solve(String num) {
        char[] n= num.toCharArray();
        Arrays.sort(n);
        int sum=0;
        System.out.print("sorted number in non-increasing order : ");
        for(int i = num.length()-1;i>=0;i--) {
            int tmp= n[i]-'0';
            System.out.print(tmp);
            if(tmp%2==0) sum+=tmp;
        }
        System.out.println("\nsum of even numbers: "+sum);
        System.out.println((sum>15)?"True":"False");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String num = in.readLine();
        solve(num);
    }
}
