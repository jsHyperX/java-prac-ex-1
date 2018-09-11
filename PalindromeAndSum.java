import java.io.*;

public class PalindromeAndSum {

    /**
     * this method checks if a given string is palindrome or
     * not and finds sum of all even digits of the palindrome
     * @param s: input string
     */

    public int solve(String s) {
        boolean flag=true;
        String isit;
        int n = s.length(),sum=0;
        for(int i=0;i<n/2;i++) {
            int a = Character.getNumericValue(s.charAt(i));
            if(s.charAt(n-1-i)!=s.charAt(i)) flag=false;
            else {
                if (a%2 == 0) sum += 2*(a);
            }
        }
        if(n%2==1) {
            if((int)s.charAt(n/2)%2==0) sum+=Character.getNumericValue(s.charAt(n/2));
        }
        if(!flag) {
            System.out.println(s+ " is not a palindrome");
        }
        else {
            if(sum>25) isit="greater";
            else isit="less";
            System.out.println(s+" is a palindrome and sum of even numbers is "+isit+" than 25");
        }
        return sum;
    }

    public void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String inp = in.readLine();
        solve(inp);
    }
}
