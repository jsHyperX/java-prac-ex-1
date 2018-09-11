import java.io.*;

public class ReverseWithoutBuffer {

    public static void solve(String num) {
        char[] str = num.toCharArray();
        int l= num.length();
        for(int i=0;i<l/2;i++) {
            str[i]=num.charAt(l-1-i);
            str[l-1-i]=num.charAt(i);
        }
        String s="";
        for(char c:str) s+=c;
        System.out.println(s);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String num = in.readLine();
        solve(num);
    }
}
